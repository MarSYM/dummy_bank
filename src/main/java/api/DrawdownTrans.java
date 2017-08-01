package api;

public class DrawdownTrans {
	
	private String time;
	private String tradeNavigatorTransactionNo;
	private String tradeNavigatorTransactionTimeStamp;
	private String interestAmount;
	private String repaymentFee;
	private String returnStatus;
	private String returnCode;
	private String returnMessage;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTradeNavigatorTransactionNo() {
		return tradeNavigatorTransactionNo;
	}
	public void setTradeNavigatorTransactionNo(String tradeNavigatorTransactionNo) {
		this.tradeNavigatorTransactionNo = tradeNavigatorTransactionNo;
	}
	
	public String getTradeNavigatorTransactionTimeStamp() {
		return tradeNavigatorTransactionTimeStamp;
	}
	public void setTradeNavigatorTransactionTimeStamp(String tradeNavigatorTransactionTimeStamp) {
		this.tradeNavigatorTransactionTimeStamp = tradeNavigatorTransactionTimeStamp;
	}
	
	public String getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	public String getRepaymentFee() {
		return repaymentFee;
	}
	public void setRepaymentFee(String repaymentFee) {
		this.repaymentFee = repaymentFee;
	}
	
	public String getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

}
