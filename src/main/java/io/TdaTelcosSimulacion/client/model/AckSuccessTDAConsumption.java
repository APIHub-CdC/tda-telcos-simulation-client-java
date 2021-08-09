package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.AckTelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.Error;
import io.TdaTelcosSimulacion.client.model.SuccessTDAConsumption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Acknowledge of a successful telcos data aggregation process.")


public class AckSuccessTDAConsumption extends AckTelcosDataAggregation {
  @SerializedName("telcosDataAggregation")
  private SuccessTDAConsumption telcosDataAggregation = null;
  @SerializedName("errors")
  private List<Error> errors = null;
  public AckSuccessTDAConsumption telcosDataAggregation(SuccessTDAConsumption telcosDataAggregation) {
    this.telcosDataAggregation = telcosDataAggregation;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public SuccessTDAConsumption getTelcosDataAggregation() {
    return telcosDataAggregation;
  }
  public void setTelcosDataAggregation(SuccessTDAConsumption telcosDataAggregation) {
    this.telcosDataAggregation = telcosDataAggregation;
  }
  public AckSuccessTDAConsumption errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }
  public AckSuccessTDAConsumption addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }
   
  @ApiModelProperty(value = "List of errors.")
  public List<Error> getErrors() {
    return errors;
  }
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckSuccessTDAConsumption ackSuccessTDAConsumption = (AckSuccessTDAConsumption) o;
    return Objects.equals(this.telcosDataAggregation, ackSuccessTDAConsumption.telcosDataAggregation) &&
        Objects.equals(this.errors, ackSuccessTDAConsumption.errors) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(telcosDataAggregation, errors, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckSuccessTDAConsumption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    telcosDataAggregation: ").append(toIndentedString(telcosDataAggregation)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
