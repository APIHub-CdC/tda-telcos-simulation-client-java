package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
@ApiModel(description = "Identifier of the telcos data aggregation process.")


public class TelcosDataAggregationId {
  @SerializedName("requestId")
  private UUID requestId = null;
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;
  @SerializedName("inquiryId")
  private UUID inquiryId = null;
  public TelcosDataAggregationId requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }
   
  @ApiModelProperty(example = "391d151f-1cac-44e7-a05b-79a1199621d6", value = "The identifier of the telcos data aggregation request given by the API consumer (UUID).")
  public UUID getRequestId() {
    return requestId;
  }
  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }
  public TelcosDataAggregationId subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }
   
  @ApiModelProperty(example = "7c8a0230-36e0-43f4-9b7a-581dc55ea9c3", value = "The API Hub event subscription identifier (UUID).")
  public UUID getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
   
  @ApiModelProperty(example = "a19fb6b8-2677-44f2-9cd7-3b2f78bb6f8c", value = "The telcos data aggregation process identifier given by Círculo de Crédito.")
  public UUID getInquiryId() {
    return inquiryId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosDataAggregationId telcosDataAggregationId = (TelcosDataAggregationId) o;
    return Objects.equals(this.requestId, telcosDataAggregationId.requestId) &&
        Objects.equals(this.subscriptionId, telcosDataAggregationId.subscriptionId) &&
        Objects.equals(this.inquiryId, telcosDataAggregationId.inquiryId);
  }
  @Override
  public int hashCode() {
    return Objects.hash(requestId, subscriptionId, inquiryId);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosDataAggregationId {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
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
