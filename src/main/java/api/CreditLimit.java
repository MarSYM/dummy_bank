package api;

public class CreditLimit {
	private String time;
	private String tnResponseDateTimeStamp;
	private String creditLimit;
	private String outstanding;
	private String remainingLimit;
	private String pendingDrawdownAmount;
	private String pendingDebitAmount;
	private String returnStatus;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTnResponseDateTimeStamp() {
		return tnResponseDateTimeStamp;
	}
	public void setTnResponseDateTimeStamp(String tnResponseDateTimeStamp) {
		this.tnResponseDateTimeStamp = tnResponseDateTimeStamp;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(String outstanding) {
		this.outstanding = outstanding;
	}
	public String getRemainingLimit() {
		return remainingLimit;
	}
	public void setRemainingLimit(String remainingLimit) {
		this.remainingLimit = remainingLimit;
	}
	public String getPendingDrawdownAmount() {
		return pendingDrawdownAmount;
	}
	public void setPendingDrawdownAmount(String pendingDrawdownAmount) {
		this.pendingDrawdownAmount = pendingDrawdownAmount;
	}
	public String getPendingDebitAmount() {
		return pendingDebitAmount;
	}
	public void setPendingDebitAmount(String pendingDebitAmount) {
		this.pendingDebitAmount = pendingDebitAmount;
	}
	public String getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	
	
}
