package io.TdaTelcosSimulacion.helper;

import java.io.IOException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ECDHAlgCipher {

	private Logger logger = LoggerFactory.getLogger(ECDHAlgCipher.class.getName());
	private PrivateKey priKey;
	private PublicKey pubKey;

	public ECDHAlgCipher(String publicKey, String keystoreFile, String keystorePassword, String keyPassword,
			String keyAlias) throws IOException {
		KeyFactory keyFactory;
		X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(publicKey));
		try {
			keyFactory = KeyFactory.getInstance("EC");
			pubKey = keyFactory.generatePublic(pubKeySpec);
		} catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
			logger.error("Could not load public key. Exception: " + e.getMessage());
		}

		priKey = KeyHandler.readPrivateKeyFromKeystore(keystoreFile, keystorePassword, keyPassword, keyAlias);
	}

	public String decryptString(String ct, String iv) {
		try {
			Key decryptionKey = KeyHandler.generateSharedSecret(priKey, pubKey);

			byte[] decodedIV = Base64.getDecoder().decode(iv);

			IvParameterSpec ivSpec = new IvParameterSpec(decodedIV);
			Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding",
					new org.bouncycastle.jce.provider.BouncyCastleProvider());
			byte[] cipherTextBytes = Base64.getDecoder().decode(ct);
			byte[] plainText;

			cipher.init(Cipher.DECRYPT_MODE, decryptionKey, ivSpec);
			plainText = new byte[cipher.getOutputSize(cipherTextBytes.length)];
			int decryptLength = cipher.update(cipherTextBytes, 0, cipherTextBytes.length, plainText, 0);
			decryptLength += cipher.doFinal(plainText, decryptLength);

			return new String(plainText, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
