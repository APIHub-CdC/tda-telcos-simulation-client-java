package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.TelcosDataAggregation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Information about a successful bank data aggregation process.")


public class SuccessTDAConsumption {
  @SerializedName("request")
  private TelcosDataAggregation request = null;
  @SerializedName("payload")
  private Object payload = null;
  public SuccessTDAConsumption request(TelcosDataAggregation request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public TelcosDataAggregation getRequest() {
    return request;
  }
  public void setRequest(TelcosDataAggregation request) {
    this.request = request;
  }
  public SuccessTDAConsumption payload(Object payload) {
    this.payload = payload;
    return this;
  }
   
  @ApiModelProperty(example = "OR8BkEcX/i+DQ2IxMkT2nmII3V8yvm1MInlQrBX4NcgmIA==", value = "Payload encrypted")
  public Object getPayload() {
    return payload;
  }
  public void setPayload(Object payload) {
    this.payload = payload;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessTDAConsumption successTDAConsumption = (SuccessTDAConsumption) o;
    return Objects.equals(this.request, successTDAConsumption.request) &&
        Objects.equals(this.payload, successTDAConsumption.payload);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, payload);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessTDAConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
