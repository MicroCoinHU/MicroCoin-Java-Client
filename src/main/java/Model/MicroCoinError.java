/**
 * MicroCoin
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package Model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * API error response
 **/
@ApiModel(description = "API error response")
public class MicroCoinError {
  
  @SerializedName("errorCode")
  private Integer errorCode = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("help")
  private String help = null;

  /**
   * Error code
   **/
  @ApiModelProperty(required = true, value = "Error code")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Error message
   **/
  @ApiModelProperty(value = "Error message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Help test or url, if any
   **/
  @ApiModelProperty(value = "Help test or url, if any")
  public String getHelp() {
    return help;
  }
  public void setHelp(String help) {
    this.help = help;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroCoinError microCoinError = (MicroCoinError) o;
    return (this.errorCode == null ? microCoinError.errorCode == null : this.errorCode.equals(microCoinError.errorCode)) &&
        (this.message == null ? microCoinError.message == null : this.message.equals(microCoinError.message)) &&
        (this.help == null ? microCoinError.help == null : this.help.equals(microCoinError.help));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.errorCode == null ? 0: this.errorCode.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.help == null ? 0: this.help.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroCoinError {\n");
    
    sb.append("  errorCode: ").append(errorCode).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  help: ").append(help).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
