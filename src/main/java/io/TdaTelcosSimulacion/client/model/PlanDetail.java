package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.PlanDetailServiceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "It has the details or description of the hired plan for the account")


public class PlanDetail {
  @SerializedName("account")
  private String account = null;
  @SerializedName("plan_type")
  private String planType = null;
  @SerializedName("period")
  private String period = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("address")
  private List<String> address = null;
  @SerializedName("calls")
  private Object calls = null;
  @SerializedName("service_data")
  private List<PlanDetailServiceData> serviceData = null;
  public PlanDetail account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(example = "093632674", value = "Account Number. This is given by the Telco company")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  public PlanDetail planType(String planType) {
    this.planType = planType;
    return this;
  }
   
  @ApiModelProperty(example = "plan", value = "If it is prepaid or postpaid plan")
  public String getPlanType() {
    return planType;
  }
  public void setPlanType(String planType) {
    this.planType = planType;
  }
  public PlanDetail period(String period) {
    this.period = period;
    return this;
  }
   
  @ApiModelProperty(example = "2021-05", value = "Current billing period by date")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }
  public PlanDetail username(String username) {
    this.username = username;
    return this;
  }
   
  @ApiModelProperty(example = "CRUZ SANCHEZ MIGUEL", value = "IF available we bring the name(s) of the customer")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public PlanDetail address(List<String> address) {
    this.address = address;
    return this;
  }
  public PlanDetail addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }
   
  @ApiModelProperty(example = "[\"CALLE DE LOS BOSQUES 3 INT 1\"]", value = "If available, the billing address of the customer")
  public List<String> getAddress() {
    return address;
  }
  public void setAddress(List<String> address) {
    this.address = address;
  }
  public PlanDetail calls(Object calls) {
    this.calls = calls;
    return this;
  }
   
  @ApiModelProperty(value = "top 10 calls")
  public Object getCalls() {
    return calls;
  }
  public void setCalls(Object calls) {
    this.calls = calls;
  }
  public PlanDetail serviceData(List<PlanDetailServiceData> serviceData) {
    this.serviceData = serviceData;
    return this;
  }
  public PlanDetail addServiceDataItem(PlanDetailServiceData serviceDataItem) {
    if (this.serviceData == null) {
      this.serviceData = new ArrayList<PlanDetailServiceData>();
    }
    this.serviceData.add(serviceDataItem);
    return this;
  }
   
  @ApiModelProperty(value = "When available, it shows the detail of consumption of the different services hired for the account")
  public List<PlanDetailServiceData> getServiceData() {
    return serviceData;
  }
  public void setServiceData(List<PlanDetailServiceData> serviceData) {
    this.serviceData = serviceData;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanDetail planDetail = (PlanDetail) o;
    return Objects.equals(this.account, planDetail.account) &&
        Objects.equals(this.planType, planDetail.planType) &&
        Objects.equals(this.period, planDetail.period) &&
        Objects.equals(this.username, planDetail.username) &&
        Objects.equals(this.address, planDetail.address) &&
        Objects.equals(this.calls, planDetail.calls) &&
        Objects.equals(this.serviceData, planDetail.serviceData);
  }
  @Override
  public int hashCode() {
    return Objects.hash(account, planType, period, username, address, calls, serviceData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanDetail {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    serviceData: ").append(toIndentedString(serviceData)).append("\n");
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
