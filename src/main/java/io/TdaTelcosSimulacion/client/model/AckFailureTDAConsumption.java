package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.AckTelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.FailureTDAConsumption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Acknowledge of an unsuccessful telcos data aggregation process.")


public class AckFailureTDAConsumption extends AckTelcosDataAggregation {
  @SerializedName("telcosDataAggregation")
  private FailureTDAConsumption telcosDataAggregation = null;
  public AckFailureTDAConsumption telcosDataAggregation(FailureTDAConsumption telcosDataAggregation) {
    this.telcosDataAggregation = telcosDataAggregation;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public FailureTDAConsumption getTelcosDataAggregation() {
    return telcosDataAggregation;
  }
  public void setTelcosDataAggregation(FailureTDAConsumption telcosDataAggregation) {
    this.telcosDataAggregation = telcosDataAggregation;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckFailureTDAConsumption ackFailureTDAConsumption = (AckFailureTDAConsumption) o;
    return Objects.equals(this.telcosDataAggregation, ackFailureTDAConsumption.telcosDataAggregation) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(telcosDataAggregation, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckFailureTDAConsumption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    telcosDataAggregation: ").append(toIndentedString(telcosDataAggregation)).append("\n");
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
