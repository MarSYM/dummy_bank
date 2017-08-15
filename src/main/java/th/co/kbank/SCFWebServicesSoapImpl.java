/**
 * SCFWebServicesSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

import java.util.List;

import api.CreditLimit;
import api.DebitTrans;
//import api.DelayTime;
import api.DrawdownTrans;
import gec.scf.CreditLimitServices;
import gec.scf.DebitTransServices;
import gec.scf.DrawdownTransService;



public class SCFWebServicesSoapImpl implements th.co.kbank.SCFWebServicesSoap{
	
    public java.lang.String sendDrawdownTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
//    	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    	DrawdownTransService drawdownTransService = new DrawdownTransService();
    	List<DrawdownTrans> drawdownTransList = drawdownTransService.getDrawdownTrans();
    	DrawdownTrans drawdownTrans = drawdownTransList.get(0);
    	if(Integer.parseInt(drawdownTrans.getTime())>0){
    		try {
    		    Thread.sleep(Integer.parseInt(drawdownTrans.getTime())*1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    		    Thread.currentThread().interrupt();
    		}
    	}

    	String sponsor_ref = transReq.substring(0, 20);	
    	String buyer_ref = transReq.substring(20, 40);
    	String drawdown_no = transReq.substring(40, 55);
    	String request_date_time_stamp = transReq.substring(55, 69);
    	String drawdown_amount = transReq.substring(69, 81);
    	String drawdown_date = transReq.substring(81, 89);
    	String maturity_date = transReq.substring(89, 97);
    	String interest_rate = transReq.substring(97, 112);
    	String invoice_amount = transReq.substring(112, 124);
    	String transaction_type = transReq.substring(124, 125);
    	String loan_type = transReq.substring(125, 127);
    	String reason_message = transReq.substring(127, 255);
    	String request_mode = transReq.substring(255, 256);

    	double repayment_amount = Double.parseDouble(drawdown_amount)+(Double.parseDouble(drawdownTrans.getInterestAmount())*100)+(Double.parseDouble(drawdownTrans.getRepaymentFee())*100);
    	
    	String result_drawdownTrans = drawdown_no+
    			String.format("%-20s",drawdownTrans.getTradeNavigatorTransactionNo())	+
    			String.format("%-14s",drawdownTrans.getTradeNavigatorTransactionTimeStamp())+
    			sponsor_ref+	buyer_ref+		drawdown_amount+
    			String.format("%-12s",drawdownTrans.getInterestAmount())+
    			String.format("%-7s",drawdownTrans.getRepaymentFee())+
    			String.format("%012.0f",repayment_amount)+
    			String.format("%-2s",drawdownTrans.getReturnStatus())+
    			String.format("%-3s",drawdownTrans.getReturnCode())+
    			String.format("%-100s",drawdownTrans.getReturnMessage());
    	
    	if (request_mode.equals("I")){
    		double repayment_amount2 = Double.parseDouble(drawdown_amount)+(Double.parseDouble(drawdownTrans.getInterestAmount2())*100)+(Double.parseDouble(drawdownTrans.getRepaymentFee2())*100);
    				result_drawdownTrans = drawdown_no+
        			String.format("%-20s",drawdownTrans.getTradeNavigatorTransactionNo2())	+
        			String.format("%-14s",drawdownTrans.getTradeNavigatorTransactionTimeStamp2())+
        			sponsor_ref+	buyer_ref+		drawdown_amount+
        			String.format("%-12s",drawdownTrans.getInterestAmount2())+
        			String.format("%-7s",drawdownTrans.getRepaymentFee2())+
        			String.format("%012.0f",repayment_amount2)+
        			String.format("%-2s",drawdownTrans.getReturnStatus2())+
        			String.format("%-3s",drawdownTrans.getReturnCode2())+
        			String.format("%-100s",drawdownTrans.getReturnMessage2());
    		
    	}
    	

    	return result_drawdownTrans;
    }

    public java.lang.String sendDebitTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
    	
    	DebitTransServices debitTransServices = new DebitTransServices();
    	List<DebitTrans> debitTransList = debitTransServices.getDebitTrans();
    	DebitTrans debitTrans = debitTransList.get(0);
    	if(Integer.parseInt(debitTrans.getTime())>0){
    		try {
    		    Thread.sleep(Integer.parseInt(debitTrans.getTime())*1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    		    Thread.currentThread().interrupt();
    		}
    	}
    	
    	String direct_debit_no = transReq.substring(0, 15);
    	String sponsor_ref = transReq.substring(15, 35);
    	String buyer_ref = transReq.substring(35, 55);
    	String payer_bank_account = transReq.substring(55, 75);
    	String total_payment_amount = transReq.substring(75, 87);
    	String request_datetime_stamp = transReq.substring(87, 101);
    	String Debit_Effective_Date  = transReq.substring(101, 109);
    	String Debit_Type = transReq.substring(109, 110);
    	String Transaction_Type = transReq.substring(110, 111);
    	String Reason_Message = transReq.substring(111, 239);
    	String Request_Mode = transReq.substring(239, 240);
    	
    	
    	String result_debitTrans = direct_debit_no +
    			String.format("%-20s",debitTrans.getPaymentTransactionNo())+
    			String.format("%-14s",debitTrans.getTnTransactionTimeStamp())+
    			sponsor_ref + buyer_ref + payer_bank_account + total_payment_amount +
    			String.format("%-7s",debitTrans.getDebitFee())+
    			String.format("%-12s",debitTrans.getDebitAmount())+
    			String.format("%-2s",debitTrans.getReturnStatus())+
    			String.format("%-3s",debitTrans.getReturnCode())+
    			String.format("%-100s",debitTrans.getReturnMessage());
    	
    	if (Request_Mode.equals("I") && debitTrans.getReturnStatus2()!=("DS"))
		{
			result_debitTrans = direct_debit_no +
					String.format("%-20s",debitTrans.getPaymentTransactionNo2())+
	    			String.format("%-14s",debitTrans.getTnTransactionTimeStamp2())+
	    			sponsor_ref + buyer_ref + payer_bank_account + total_payment_amount +
	    			String.format("%-7s",debitTrans.getDebitFee2())+
	    			String.format("%-12s",debitTrans.getDebitAmount2())+
	    			String.format("%-2s",debitTrans.getReturnStatus2())+
	    			String.format("%-3s",debitTrans.getReturnCode2())+
	    			String.format("%-100s",debitTrans.getReturnMessage2());
	    			
		}
    	else if (debitTrans.getReturnStatus2().equals("DS") && Request_Mode.equals("I") )
		{
    		double repayment_amount2 = (Double.parseDouble(debitTrans.getDrawdownAmount2())*100)+(Double.parseDouble(debitTrans.getInterestAmount2())*100)+(Double.parseDouble(debitTrans.getRepaymentFee2())*100);
			result_debitTrans = direct_debit_no +
					String.format("%-20s",debitTrans.getPaymentTransactionNo2())+
	    			String.format("%-14s",debitTrans.getTnTransactionTimeStamp2())+
	    			sponsor_ref + buyer_ref + payer_bank_account + total_payment_amount +
	    			String.format("%-7s",debitTrans.getDebitFee2())+
	    			String.format("%-12s",debitTrans.getDebitAmount2())+
	    			String.format("%-2s",debitTrans.getReturnStatus2())+
	    			String.format("%-3s",debitTrans.getReturnCode2())+
	    			String.format("%-100s",debitTrans.getReturnMessage2())+
	    			String.format("%-20s",debitTrans.getLoanTransactionNo2())+
	    			String.format("%-8s",debitTrans.getDrawdownDate2())+
	    			String.format("%-8s",debitTrans.getMaturityDate2())+
	    			String.format("%-12s",debitTrans.getDrawdownAmount2())+
	    			String.format("%-12s",debitTrans.getInterestAmount2())+
	    			String.format("%-7s",debitTrans.getRepaymentFee2())+ 
	    			String.format("%012.0f",repayment_amount2);
		}
    	
    			
    	
    	
    	else if (debitTrans.getReturnStatus().equals("DS") && Request_Mode.equals("N"))
    			{
    		
    		double repayment_amount = (Double.parseDouble(debitTrans.getDrawdownAmount())*100)+(Double.parseDouble(debitTrans.getInterestAmount())*100)+(Double.parseDouble(debitTrans.getRepaymentFee())*100);
    				result_debitTrans = direct_debit_no +
    						String.format("%-20s",debitTrans.getPaymentTransactionNo())+
    		    			String.format("%-14s",debitTrans.getTnTransactionTimeStamp())+
    		    			sponsor_ref + buyer_ref + payer_bank_account + total_payment_amount +
    		    			String.format("%-7s",debitTrans.getDebitFee())+
    		    			String.format("%-12s",debitTrans.getDebitAmount())+
    		    			String.format("%-2s",debitTrans.getReturnStatus())+
    		    			String.format("%-3s",debitTrans.getReturnCode())+
    		    			String.format("%-100s",debitTrans.getReturnMessage())+
    		    			String.format("%-20s",debitTrans.getLoanTransactionNo())+
    		    			String.format("%-8s",debitTrans.getDrawdownDate())+
    		    			String.format("%-8s",debitTrans.getMaturityDate())+
    		    			String.format("%-12s",debitTrans.getDrawdownAmount())+
    		    			String.format("%-12s",debitTrans.getInterestAmount())+
    		    			String.format("%-7s",debitTrans.getRepaymentFee())+
    		    			String.format("%012.0f",repayment_amount);
    			}
    			
    			
    	
    	
        return result_debitTrans;
    }

    public java.lang.String inqCreditLimit(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
    	
    	CreditLimitServices creditLimitServices = new CreditLimitServices();
    	List<CreditLimit> creditLimitList = creditLimitServices.getCreditLimit();
    	CreditLimit creditLimit = creditLimitList.get(0);
    	if(Integer.parseInt(creditLimit.getTime())>0){
    		try {
    		    Thread.sleep(Integer.parseInt(creditLimit.getTime())*1000);                 //1000 milliseconds is one second.
    		} catch(InterruptedException ex) {
    		    Thread.currentThread().interrupt();
    		}
    	}

    	String sponsor_ref = transReq.substring(0, 20);	
    	String buyer_ref = transReq.substring(20, 40);
    	String product_type = transReq.substring(40, 43);
    	String request_date_time_stamp = transReq.substring(43, 57);
    	String request_mode = transReq.substring(57);

//    	double credit_limit  = Double.parseDouble(creditLimit.getOutstanding())+(Double.parseDouble(creditLimit.getRemainingLimit())*100)+(Double.parseDouble(creditLimit.getPendingDebitAmount())*100)+(Double.parseDouble(creditLimit.getPendingDrawdownAmount())*100);
    	
    	double creditlimit = (Double.parseDouble(creditLimit.getCreditLimit())*100);
    	double outstanding = (Double.parseDouble(creditLimit.getOutstanding())*100);
    	double remaininglimit = (Double.parseDouble(creditLimit.getRemainingLimit())*100);
    	double pendingdrawdownamount = (Double.parseDouble(creditLimit.getPendingDrawdownAmount())*100);
    	double pendingdebitamount = (Double.parseDouble(creditLimit.getPendingDebitAmount())*100);
    	String result_creditLimit = sponsor_ref + buyer_ref + product_type +
    			String.format("%-14s",creditLimit.getTnResponseDateTimeStamp())	+ 
    			String.format("%012.0f",creditlimit)+
    			String.format("%012.0f",outstanding)+
    			String.format("%012.0f",remaininglimit)+
    			String.format("%012.0f",pendingdrawdownamount)+
    			String.format("%012.0f",pendingdebitamount)+
    			String.format("%-2s",creditLimit.getReturnStatus());
    	return result_creditLimit;
    }

    public java.lang.String getBuildVersion() throws java.rmi.RemoteException {
        return null;
    }

}
