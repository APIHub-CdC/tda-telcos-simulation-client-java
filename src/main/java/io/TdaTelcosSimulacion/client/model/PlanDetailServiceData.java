package io.TdaTelcosSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
@ApiModel(description = "When available, it shows the detail of consumption of the different services hired for the account")


public class PlanDetailServiceData {
  @SerializedName("concept")
  private String concept = null;
  @SerializedName("included")
  private String included = null;
  @SerializedName("consumed")
  private String consumed = null;
  @SerializedName("excess")
  private BigDecimal excess = null;
  @SerializedName("date")
  private String date = null;
  @SerializedName("import")
  private BigDecimal _import = null;
  public PlanDetailServiceData concept(String concept) {
    this.concept = concept;
    return this;
  }
   
  @ApiModelProperty(value = "Description of the Service according to the telco source.")
  public String getConcept() {
    return concept;
  }
  public void setConcept(String concept) {
    this.concept = concept;
  }
  public PlanDetailServiceData included(String included) {
    this.included = included;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "SMS, minutes, data MB, included in the service plan")
  public String getIncluded() {
    return included;
  }
  public void setIncluded(String included) {
    this.included = included;
  }
  public PlanDetailServiceData consumed(String consumed) {
    this.consumed = consumed;
    return this;
  }
   
  @ApiModelProperty(example = "0.9473", value = "SMS, minutes, data MB, consumed in the period")
  public String getConsumed() {
    return consumed;
  }
  public void setConsumed(String consumed) {
    this.consumed = consumed;
  }
  public PlanDetailServiceData excess(BigDecimal excess) {
    this.excess = excess;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "When available, consumption exceeding the included SMS, minutes or Data MB")
  public BigDecimal getExcess() {
    return excess;
  }
  public void setExcess(BigDecimal excess) {
    this.excess = excess;
  }
  public PlanDetailServiceData date(String date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(example = "2021-06-22", value = "When available, ending date for the service plan")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public PlanDetailServiceData _import(BigDecimal _import) {
    this._import = _import;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "Amount charged for the specific service")
  public BigDecimal getImport() {
    return _import;
  }
  public void setImport(BigDecimal _import) {
    this._import = _import;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanDetailServiceData planDetailServiceData = (PlanDetailServiceData) o;
    return Objects.equals(this.concept, planDetailServiceData.concept) &&
        Objects.equals(this.included, planDetailServiceData.included) &&
        Objects.equals(this.consumed, planDetailServiceData.consumed) &&
        Objects.equals(this.excess, planDetailServiceData.excess) &&
        Objects.equals(this.date, planDetailServiceData.date) &&
        Objects.equals(this._import, planDetailServiceData._import);
  }
  @Override
  public int hashCode() {
    return Objects.hash(concept, included, consumed, excess, date, _import);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanDetailServiceData {\n");
    
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
    sb.append("    excess: ").append(toIndentedString(excess)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    _import: ").append(toIndentedString(_import)).append("\n");
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
