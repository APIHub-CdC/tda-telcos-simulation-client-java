package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;

import io.TdaTelcosSimulacion.client.model.TelcosDataAggregation;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
@SuppressWarnings("serial")
@ApiModel(description = "A list of telcos data aggregation processes.")


public class TelcosDataAggregations extends ArrayList<TelcosDataAggregation> {
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosDataAggregations {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
