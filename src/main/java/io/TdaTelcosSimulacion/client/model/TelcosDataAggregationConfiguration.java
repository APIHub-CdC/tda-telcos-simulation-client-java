package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.ConfigurationRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
@ApiModel(description = "Telcos data Agregation configuration")


public class TelcosDataAggregationConfiguration {
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;
  @SerializedName("configuration")
  private ConfigurationRequest _configuration = null;
  public TelcosDataAggregationConfiguration subscriptionId(UUID subscriptionId) {
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
  public TelcosDataAggregationConfiguration _configuration(ConfigurationRequest _configuration) {
    this._configuration = _configuration;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequest getConfiguration() {
    return _configuration;
  }
  public void setConfiguration(ConfigurationRequest _configuration) {
    this._configuration = _configuration;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosDataAggregationConfiguration telcosDataAggregationConfiguration = (TelcosDataAggregationConfiguration) o;
    return Objects.equals(this.subscriptionId, telcosDataAggregationConfiguration.subscriptionId) &&
        Objects.equals(this._configuration, telcosDataAggregationConfiguration._configuration);
  }
  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, _configuration);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosDataAggregationConfiguration {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
