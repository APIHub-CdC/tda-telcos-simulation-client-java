package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
@ApiModel(description = "Shows information about air time and credits sent from the account to another phone or account")


public class CreditPayment {
  @SerializedName("date")
  private String date = null;
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("status")
  private Boolean status = null;
  @SerializedName("destination_number")
  private String destinationNumber = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("account")
  private String account = null;
  public CreditPayment date(String date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Payment date. Format \"yyyy-mm-dd\"")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public CreditPayment folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "0000531027", value = "Payment mode")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public CreditPayment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }
   
  @ApiModelProperty(example = "200.0", value = "Amount paid")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  public CreditPayment status(Boolean status) {
    this.status = status;
    return this;
  }
   
  @ApiModelProperty(example = "true", value = "")
  public Boolean isStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }
  public CreditPayment destinationNumber(String destinationNumber) {
    this.destinationNumber = destinationNumber;
    return this;
  }
   
  @ApiModelProperty(example = "8116069546", value = "")
  public String getDestinationNumber() {
    return destinationNumber;
  }
  public void setDestinationNumber(String destinationNumber) {
    this.destinationNumber = destinationNumber;
  }
  public CreditPayment type(String type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(example = "Una Vez **** 9881", value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public CreditPayment method(String method) {
    this.method = method;
    return this;
  }
   
  @ApiModelProperty(example = "AND", value = "")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }
  public CreditPayment account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(value = "Billed account.")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayment creditPayment = (CreditPayment) o;
    return Objects.equals(this.date, creditPayment.date) &&
        Objects.equals(this.folio, creditPayment.folio) &&
        Objects.equals(this.amount, creditPayment.amount) &&
        Objects.equals(this.status, creditPayment.status) &&
        Objects.equals(this.destinationNumber, creditPayment.destinationNumber) &&
        Objects.equals(this.type, creditPayment.type) &&
        Objects.equals(this.method, creditPayment.method) &&
        Objects.equals(this.account, creditPayment.account);
  }
  @Override
  public int hashCode() {
    return Objects.hash(date, folio, amount, status, destinationNumber, type, method, account);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    destinationNumber: ").append(toIndentedString(destinationNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
