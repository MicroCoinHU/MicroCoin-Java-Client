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

import Model.Signature;
import Model.TransactionRequest;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Transaction entity
 **/
@ApiModel(description = "Transaction entity")
public class Transaction {
  
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("fee")
  private BigDecimal fee = null;
  @SerializedName("payload")
  private String payload = null;
  @SerializedName("sender")
  private String sender = null;
  @SerializedName("target")
  private String target = null;
  @SerializedName("hash")
  private String hash = null;
  @SerializedName("signature")
  private Signature signature = null;

  /**
   * Number of coins to send
   **/
  @ApiModelProperty(required = true, value = "Number of coins to send")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Fee, if any Otherwise zero
   **/
  @ApiModelProperty(required = true, value = "Fee, if any Otherwise zero")
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  /**
   * Optional payload string
   **/
  @ApiModelProperty(value = "Optional payload string")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  /**
   * The sender account
   **/
  @ApiModelProperty(required = true, value = "The sender account")
  public String getSender() {
    return sender;
  }
  public void setSender(String sender) {
    this.sender = sender;
  }

  /**
   * The target (receiver) account
   **/
  @ApiModelProperty(required = true, value = "The target (receiver) account")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  /**
   * Transaction hash to sign
   **/
  @ApiModelProperty(value = "Transaction hash to sign")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Signature getSignature() {
    return signature;
  }
  public void setSignature(Signature signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return (this.amount == null ? transaction.amount == null : this.amount.equals(transaction.amount)) &&
        (this.fee == null ? transaction.fee == null : this.fee.equals(transaction.fee)) &&
        (this.payload == null ? transaction.payload == null : this.payload.equals(transaction.payload)) &&
        (this.sender == null ? transaction.sender == null : this.sender.equals(transaction.sender)) &&
        (this.target == null ? transaction.target == null : this.target.equals(transaction.target)) &&
        (this.hash == null ? transaction.hash == null : this.hash.equals(transaction.hash)) &&
        (this.signature == null ? transaction.signature == null : this.signature.equals(transaction.signature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.fee == null ? 0: this.fee.hashCode());
    result = 31 * result + (this.payload == null ? 0: this.payload.hashCode());
    result = 31 * result + (this.sender == null ? 0: this.sender.hashCode());
    result = 31 * result + (this.target == null ? 0: this.target.hashCode());
    result = 31 * result + (this.hash == null ? 0: this.hash.hashCode());
    result = 31 * result + (this.signature == null ? 0: this.signature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  fee: ").append(fee).append("\n");
    sb.append("  payload: ").append(payload).append("\n");
    sb.append("  sender: ").append(sender).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
