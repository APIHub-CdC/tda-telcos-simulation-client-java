package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


public class Call {
  @SerializedName("priority")
  private BigDecimal priority = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("destination")
  private String destination = null;
  @SerializedName("frequency")
  private BigDecimal frequency = null;
  @SerializedName("total_minutes")
  private BigDecimal totalMinutes = null;
  public Call priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }
   
  @ApiModelProperty(example = "1.0", value = "")
  public BigDecimal getPriority() {
    return priority;
  }
  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }
  public Call phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
   
  @ApiModelProperty(example = "5563160228", value = "Destination phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public Call destination(String destination) {
    this.destination = destination;
    return this;
  }
   
  @ApiModelProperty(example = "CUAUHTEMOC CDM", value = "Destination call location")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }
  public Call frequency(BigDecimal frequency) {
    this.frequency = frequency;
    return this;
  }
   
  @ApiModelProperty(example = "3.0", value = "")
  public BigDecimal getFrequency() {
    return frequency;
  }
  public void setFrequency(BigDecimal frequency) {
    this.frequency = frequency;
  }
  public Call totalMinutes(BigDecimal totalMinutes) {
    this.totalMinutes = totalMinutes;
    return this;
  }
   
  @ApiModelProperty(example = "3.0", value = "")
  public BigDecimal getTotalMinutes() {
    return totalMinutes;
  }
  public void setTotalMinutes(BigDecimal totalMinutes) {
    this.totalMinutes = totalMinutes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(this.priority, call.priority) &&
        Objects.equals(this.phoneNumber, call.phoneNumber) &&
        Objects.equals(this.destination, call.destination) &&
        Objects.equals(this.frequency, call.frequency) &&
        Objects.equals(this.totalMinutes, call.totalMinutes);
  }
  @Override
  public int hashCode() {
    return Objects.hash(priority, phoneNumber, destination, frequency, totalMinutes);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    totalMinutes: ").append(toIndentedString(totalMinutes)).append("\n");
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
