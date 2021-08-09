package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.TdaTelcosSimulacion.client.model.AckTelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.ConfigurationRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Acknowledge of a successful telcos data aggregation process.")


public class TelcosDataAggregationConfigurationResponse extends AckTelcosDataAggregation {
  @SerializedName("configuration")
  private ConfigurationRequest _configuration = null;
  public TelcosDataAggregationConfigurationResponse _configuration(ConfigurationRequest _configuration) {
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
    TelcosDataAggregationConfigurationResponse telcosDataAggregationConfigurationResponse = (TelcosDataAggregationConfigurationResponse) o;
    return Objects.equals(this._configuration, telcosDataAggregationConfigurationResponse._configuration) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(_configuration, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosDataAggregationConfigurationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
