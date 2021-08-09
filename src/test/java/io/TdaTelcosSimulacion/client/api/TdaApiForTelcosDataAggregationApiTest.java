package io.TdaTelcosSimulacion.client.api;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.OffsetDateTime;

import io.TdaTelcosSimulacion.client.ApiClient;
import io.TdaTelcosSimulacion.client.ApiException;
import io.TdaTelcosSimulacion.client.ApiResponse;
import io.TdaTelcosSimulacion.client.model.AckSuccessTDAConsumption;
import io.TdaTelcosSimulacion.client.model.AckTDARequest;
import io.TdaTelcosSimulacion.client.model.AckTelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.ConfigurationRequest;
import io.TdaTelcosSimulacion.client.model.ConfigurationRequestDescriptions;
import io.TdaTelcosSimulacion.client.model.ConfigurationRequestPrincipal;
import io.TdaTelcosSimulacion.client.model.ConfigurationRequestTermsAndConditions;
import io.TdaTelcosSimulacion.client.model.Icons;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregationConfiguration;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregationConfigurationResponse;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregationMetadata;
import io.TdaTelcosSimulacion.helper.ECDHAlgCipher;
import io.TdaTelcosSimulacion.helper.KeyHandler;
import okhttp3.OkHttpClient;

public class TdaApiForTelcosDataAggregationApiTest {
	
    private final TdaApiForTelcosDataAggregationApi tda = new TdaApiForTelcosDataAggregationApi();
    
    private Logger logger = LoggerFactory.getLogger(TdaApiForTelcosDataAggregationApiTest.class.getName());
    private ApiClient apiClient = null;
    private String xApiKey = "your_api_key";
	private String certFile = "/your_path_for_certificate_of_cdc/certificate.pem";
	private String privateKeyPath = "/your_path_for_your_keystore/keystore.jks";
	private String keystorePassword = "your_super_secure_keystore_password";
	private String keyPassword = "your_super_secure_key_password";
	private String keyAlias = "cdc";
	private UUID subscriptionId = UUID.fromString("uuid");
	private UUID inquiryId = null;
	
	
	@Before
	public void setUp() {
		this.apiClient = tda.getApiClient();
		this.apiClient.setBasePath("the_url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
		apiClient.setHttpClient(okHttpClient);
	}
	
	@Test
    public void postTelcosDataAggregationTest() throws ApiException {

        TelcosDataAggregation request = new TelcosDataAggregation();
        AckTDARequest tdaResponse = null;
        
        request.setRequestId(UUID.randomUUID());
        request.setSubscriptionId(subscriptionId);
        request.setCurp("MAHJ280603MSPRRV09");
        
         
        tdaResponse = tda.postTelcosDataAggregation(xApiKey, request);
        
        logger.debug(tdaResponse.toString());
        Assert.assertNotNull(tdaResponse);
        inquiryId = tdaResponse.getInquiryId();
        logger.info(inquiryId.toString());
        
        
     // List all the inquiryId available
 		String page = null;
 		String perPage = null;
 		OffsetDateTime startAt = null;
 		OffsetDateTime endAt = null;
 		String inquiryStatus = null;
 		String successCheck = null;
 		Boolean flag = true;
 		TelcosDataAggregationMetadata inquiriesResponse = tda.getTelcosDataAggregations(xApiKey, page, perPage, startAt,
 				endAt, inquiryStatus, successCheck);
 		logger.debug(inquiriesResponse.toString());
 		List<TelcosDataAggregation> inquiries = inquiriesResponse.getInquiries();
 		for (TelcosDataAggregation tda : inquiries) {
 			if (inquiryId.equals(tda.getInquiryId())) {
 				logger.debug("inquiryId is in the list");
 				Assert.assertNotNull(tda.getInquiryId());
 				flag = false;
 			}
 		}
 		if (flag) {
 			logger.debug("inquiryId not found");
 		}
 		
 		
 	// Get inquiryId status
		String xPublicKey = KeyHandler.getB64fromFile(certFile);
		ApiResponse<AckSuccessTDAConsumption> rawResponse = tda.getInquiry(xApiKey, xPublicKey, "1955be51-61da-4415-bcc0-ff752c7a69c5");
		AckSuccessTDAConsumption response = rawResponse.getData();
		Map<String, List<String>> headers = rawResponse.getHeaders();
		logger.debug(response.toString());
		String ct = (String) response.getTelcosDataAggregation().getPayload();
		String iv = headers.get("x-iv").get(0);
		String publicCDC = headers.get("x-public-key-cdc").get(0);

		
		try {
			ECDHAlgCipher cipher = new ECDHAlgCipher(publicCDC, privateKeyPath, keystorePassword, keyPassword,
					keyAlias);
			String payloadStr = cipher.decryptString(ct, iv);
			logger.info(payloadStr);
		} catch (IOException e) {
			logger.error("Could not decrypt the payload field");
		}
		
    
    }
	
	
	@Test
	public void postConfTelcosDataAggregationTest() throws ApiException {
		TelcosDataAggregationConfiguration request = new TelcosDataAggregationConfiguration();
		ConfigurationRequestPrincipal principal = new ConfigurationRequestPrincipal();
		ConfigurationRequestDescriptions descriptions = new ConfigurationRequestDescriptions();
		ConfigurationRequestTermsAndConditions terms = new ConfigurationRequestTermsAndConditions();
		ConfigurationRequest configuration = new ConfigurationRequest();

		principal.setUserName("Círculo de Crédito");
		principal.setAuthorizationStatement("INT (CIF: ) solicita su permiso para realizar las siguientes acciones:");
		principal.setUserLogo("data:image/png;base64, userlobase64");
		principal.setPrimaryColor("#0E1D36");
		principal.setSecondaryColor("#ECB330");

		descriptions.setFirstHighlightedText("Cumplimos con la directiva Europea PSD2.");
		descriptions.setFirstHighlightedIcon(Icons.FAR_FA_STAR);
		descriptions.setSecondHighlightedText("Sus datos son encriptados con la última tecnología.");
		descriptions.setSecondHighlightedIcon(Icons.FAS_FA_CREDIT_CARD);
		descriptions.setThirdHighlightedText(
				"Sus datos personales están regulados por la Ley Orgánica de Protección de Datos de Carácter Personal (GDPR).");
		descriptions.setThirdHighlightedIcon(Icons.FAS_FA_KEY);

		terms.setTermsAndConditionsTitle("Terminos y condiciones");
		terms.setTermsAndConditionsLabel(
				"Al continuar, acepto y confirmo que he leido los terminos y condiciones. Que los entiendo, acepto y quedo vinculado por ellos");
		terms.setTermsAndConditions(
				"<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vehicula tellus sed faucibus lacinia. Aenean faucibus, est in sollicitudin dapibus, justo velit venenatis magna, et aliquet lacus turpis sed nisl. Vestibulum maximus ante mi, vitae congue ipsum mollis vitae. Integer non sem ornare, hendrerit risus in, egestas tellus. Nam orci lectus, scelerisque nec commodo nec, suscipit ut nisl. Ut eu euismod erat, a dictum mi. Etiam aliquam neque nec hendrerit faucibus. Phasellus placerat finibus porta.</p><p>Nunc faucibus arcu nec metus euismod congue. Maecenas rutrum justo elit. Nunc viverra elementum semper. Proin scelerisque, sem id aliquam semper, erat orci volutpat leo, eget suscipit lectus velit id velit. Proin mattis in quam nec tristique. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nam ut mi ligula.</p><p>Pellentesque elementum neque et dui consequat convallis. Aliquam blandit non urna vel ultrices. Curabitur viverra gravida nunc eu auctor. Maecenas ac efficitur enim. Etiam molestie id nulla ut volutpat. Praesent eu dui ac sem volutpat commodo. Suspendisse convallis cursus mollis. Suspendisse condimentum lorem varius, pharetra neque sed, mattis arcu. In feugiat, nibh ac vestibulum varius, libero risus tempus nulla, sed convallis nulla neque ut velit. Mauris sed metus ligula. Vivamus molestie vehicula felis, nec aliquet justo rutrum sit amet. Pellentesque et efficitur tellus, in pretium sem. Donec euismod orci nisl, ut imperdiet risus fringilla eget. Aliquam accumsan et ipsum sed convallis. Curabitur eros nisi, porta ac lorem vel, viverra venenatis mauris.</p><p>Fusce aliquet turpis sed dui luctus molestie. Maecenas eget metus dignissim, consequat orci eget, gravida augue. Sed porttitor nibh erat, eu tempor enim pharetra in. Sed vehicula, dolor id ultricies faucibus, nunc erat elementum mi, in gravida augue elit quis libero. Nulla ac ex et tortor dictum iaculis fringilla id quam. In feugiat leo vel est iaculis, non accumsan purus gravida. Vivamus orci augue, dignissim ac pulvinar sit amet, blandit pulvinar ante. Suspendisse pellentesque nibh eget dignissim faucibus. Pellentesque eu pellentesque tortor. Fusce efficitur ligula ligula.</p><p>Aenean rhoncus elit id nibh porttitor, in dictum lectus porttitor. Mauris metus nulla, rhoncus at odio in, mollis porta urna. Sed vestibulum eros malesuada nulla varius, sit amet viverra est consectetur. Cras fringilla ornare sagittis. Ut et erat eu odio pulvinar dapibus nec sit amet risus. Nam blandit mollis urna, quis tincidunt diam ultricies non. Suspendisse id libero suscipit, viverra ligula nec, viverra odio.</p>");

		configuration.setPrincipal(principal);
		configuration.setDescriptions(descriptions);
		configuration.setTermsAndConditions(terms);

		request.setSubscriptionId(subscriptionId);
		request.setConfiguration(configuration);

		AckTelcosDataAggregation response = tda.postConfTelcosDataAggregation(xApiKey, request);
		logger.info(response.toString());
	}
	
	
    //@Test
    public void getConfTelcosDataAggregationTest() throws ApiException {
        
        TelcosDataAggregationConfigurationResponse response = tda.getConfTelcosDataAggregation(xApiKey,subscriptionId);
        logger.info(response.toString());
    }
    
}
