package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.Metadata;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Metadata (paging information) of the list of telcos data aggregation processes.")


public class TelcosDataAggregationMetadata {
  @SerializedName("_metadata")
  private Metadata metadata = null;
  @SerializedName("inquiries")
  private TelcosDataAggregations inquiries = null;
  public TelcosDataAggregationMetadata metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Metadata getMetadata() {
    return metadata;
  }
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }
  public TelcosDataAggregationMetadata inquiries(TelcosDataAggregations inquiries) {
    this.inquiries = inquiries;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public TelcosDataAggregations getInquiries() {
    return inquiries;
  }
  public void setInquiries(TelcosDataAggregations inquiries) {
    this.inquiries = inquiries;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosDataAggregationMetadata telcosDataAggregationMetadata = (TelcosDataAggregationMetadata) o;
    return Objects.equals(this.metadata, telcosDataAggregationMetadata.metadata) &&
        Objects.equals(this.inquiries, telcosDataAggregationMetadata.inquiries);
  }
  @Override
  public int hashCode() {
    return Objects.hash(metadata, inquiries);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosDataAggregationMetadata {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
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
