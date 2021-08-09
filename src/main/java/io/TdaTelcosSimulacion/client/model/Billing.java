package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
@ApiModel(description = "Account balance and billing information")


public class Billing {
  @SerializedName("account")
  private String account = null;
  @SerializedName("date")
  private String date = null;
  @SerializedName("rent")
  private BigDecimal rent = null;
  @SerializedName("addition_services")
  private String additionServices = null;
  @SerializedName("air_time")
  private BigDecimal airTime = null;
  @SerializedName("roaming_air_time")
  private BigDecimal roamingAirTime = null;
  @SerializedName("roaming_long_distance")
  private BigDecimal roamingLongDistance = null;
  @SerializedName("internet_services")
  private BigDecimal internetServices = null;
  @SerializedName("taxes")
  private BigDecimal taxes = null;
  @SerializedName("balance")
  private BigDecimal balance = null;
  @SerializedName("previous_balance")
  private BigDecimal previousBalance = null;
  public Billing account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(example = "093632674", value = "If available, the account name given by the telco company to the aggregated account")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  public Billing date(String date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(example = "2021-01-18", value = "Billing date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public Billing rent(BigDecimal rent) {
    this.rent = rent;
    return this;
  }
   
  @ApiModelProperty(example = "257.76", value = "Service rent amount")
  public BigDecimal getRent() {
    return rent;
  }
  public void setRent(BigDecimal rent) {
    this.rent = rent;
  }
  public Billing additionServices(String additionServices) {
    this.additionServices = additionServices;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of additional services")
  public String getAdditionServices() {
    return additionServices;
  }
  public void setAdditionServices(String additionServices) {
    this.additionServices = additionServices;
  }
  public Billing airTime(BigDecimal airTime) {
    this.airTime = airTime;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of air time services")
  public BigDecimal getAirTime() {
    return airTime;
  }
  public void setAirTime(BigDecimal airTime) {
    this.airTime = airTime;
  }
  public Billing roamingAirTime(BigDecimal roamingAirTime) {
    this.roamingAirTime = roamingAirTime;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of roaming air time services")
  public BigDecimal getRoamingAirTime() {
    return roamingAirTime;
  }
  public void setRoamingAirTime(BigDecimal roamingAirTime) {
    this.roamingAirTime = roamingAirTime;
  }
  public Billing roamingLongDistance(BigDecimal roamingLongDistance) {
    this.roamingLongDistance = roamingLongDistance;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of long distance air time services")
  public BigDecimal getRoamingLongDistance() {
    return roamingLongDistance;
  }
  public void setRoamingLongDistance(BigDecimal roamingLongDistance) {
    this.roamingLongDistance = roamingLongDistance;
  }
  public Billing internetServices(BigDecimal internetServices) {
    this.internetServices = internetServices;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of internet services")
  public BigDecimal getInternetServices() {
    return internetServices;
  }
  public void setInternetServices(BigDecimal internetServices) {
    this.internetServices = internetServices;
  }
  public Billing taxes(BigDecimal taxes) {
    this.taxes = taxes;
    return this;
  }
   
  @ApiModelProperty(example = "41.24", value = "Amount charged because of taxes")
  public BigDecimal getTaxes() {
    return taxes;
  }
  public void setTaxes(BigDecimal taxes) {
    this.taxes = taxes;
  }
  public Billing balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }
   
  @ApiModelProperty(example = "299.0", value = "Account balance")
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
  public Billing previousBalance(BigDecimal previousBalance) {
    this.previousBalance = previousBalance;
    return this;
  }
   
  @ApiModelProperty(example = "301.39", value = "Balance remaning from previous billing")
  public BigDecimal getPreviousBalance() {
    return previousBalance;
  }
  public void setPreviousBalance(BigDecimal previousBalance) {
    this.previousBalance = previousBalance;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Billing billing = (Billing) o;
    return Objects.equals(this.account, billing.account) &&
        Objects.equals(this.date, billing.date) &&
        Objects.equals(this.rent, billing.rent) &&
        Objects.equals(this.additionServices, billing.additionServices) &&
        Objects.equals(this.airTime, billing.airTime) &&
        Objects.equals(this.roamingAirTime, billing.roamingAirTime) &&
        Objects.equals(this.roamingLongDistance, billing.roamingLongDistance) &&
        Objects.equals(this.internetServices, billing.internetServices) &&
        Objects.equals(this.taxes, billing.taxes) &&
        Objects.equals(this.balance, billing.balance) &&
        Objects.equals(this.previousBalance, billing.previousBalance);
  }
  @Override
  public int hashCode() {
    return Objects.hash(account, date, rent, additionServices, airTime, roamingAirTime, roamingLongDistance, internetServices, taxes, balance, previousBalance);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Billing {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rent: ").append(toIndentedString(rent)).append("\n");
    sb.append("    additionServices: ").append(toIndentedString(additionServices)).append("\n");
    sb.append("    airTime: ").append(toIndentedString(airTime)).append("\n");
    sb.append("    roamingAirTime: ").append(toIndentedString(roamingAirTime)).append("\n");
    sb.append("    roamingLongDistance: ").append(toIndentedString(roamingLongDistance)).append("\n");
    sb.append("    internetServices: ").append(toIndentedString(internetServices)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    previousBalance: ").append(toIndentedString(previousBalance)).append("\n");
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
