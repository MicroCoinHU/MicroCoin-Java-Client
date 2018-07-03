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
 * Simple ECDSA public key
 **/
@ApiModel(description = "Simple ECDSA public key")
public class SimpleKey {
  
  @SerializedName("curveType")
  private String curveType = null;
  @SerializedName("x")
  private String x = null;
  @SerializedName("y")
  private String y = null;

  /**
   * The curve type of the key. Eg: secp256k1
   **/
  @ApiModelProperty(value = "The curve type of the key. Eg: secp256k1")
  public String getCurveType() {
    return curveType;
  }
  public void setCurveType(String curveType) {
    this.curveType = curveType;
  }

  /**
   * Public key X coordinate in hexadecimal
   **/
  @ApiModelProperty(value = "Public key X coordinate in hexadecimal")
  public String getX() {
    return x;
  }
  public void setX(String x) {
    this.x = x;
  }

  /**
   * Public key Y coordinate in hexadecimal
   **/
  @ApiModelProperty(value = "Public key Y coordinate in hexadecimal")
  public String getY() {
    return y;
  }
  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleKey simpleKey = (SimpleKey) o;
    return (this.curveType == null ? simpleKey.curveType == null : this.curveType.equals(simpleKey.curveType)) &&
        (this.x == null ? simpleKey.x == null : this.x.equals(simpleKey.x)) &&
        (this.y == null ? simpleKey.y == null : this.y.equals(simpleKey.y));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.curveType == null ? 0: this.curveType.hashCode());
    result = 31 * result + (this.x == null ? 0: this.x.hashCode());
    result = 31 * result + (this.y == null ? 0: this.y.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleKey {\n");
    
    sb.append("  curveType: ").append(curveType).append("\n");
    sb.append("  x: ").append(x).append("\n");
    sb.append("  y: ").append(y).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
