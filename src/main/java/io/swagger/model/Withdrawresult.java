package io.swagger.model;

import java.time.LocalDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Withdrawresult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-27T13:17:09.505Z[GMT]")


public class Withdrawresult   {
  @JsonProperty("success")
  private String success = null;

  @JsonProperty("time")
  private LocalDateTime time = null;

  @JsonProperty("dailyLimit")
  private Integer dailyLimit = null;

  public Withdrawresult success(String success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   **/
  @Schema(example = "withdraw success", required = true, description = "")
      @NotNull

    public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  public Withdrawresult remainingbalance(BigDecimal remainingbalance) {
    return this;
  }

  public Withdrawresult time(LocalDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(example = "12:00 PM", required = true, description = "")

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public Withdrawresult dailyLimit(Integer dailyLimit) {
    this.dailyLimit = dailyLimit;
    return this;
  }

  /**
   * Get dailyLimit
   * @return dailyLimit
   **/
  @Schema(example = "80", required = true, description = "")
      @NotNull

    public Integer getDailyLimit() {
    return dailyLimit;
  }

  public void setDailyLimit(Integer dailyLimit) {
    this.dailyLimit = dailyLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Withdrawresult withdrawresult = (Withdrawresult) o;
    return Objects.equals(this.success, withdrawresult.success) &&
        Objects.equals(this.time, withdrawresult.time) &&
        Objects.equals(this.dailyLimit, withdrawresult.dailyLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success,time, dailyLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Withdrawresult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
