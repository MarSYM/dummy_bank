/**
 * SCFWebServicesSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

import java.util.List;

import api.DrawdownTrans;
import gec.scf.DrawdownTransService;

public class SCFWebServicesSoapImpl implements th.co.kbank.SCFWebServicesSoap{
	
    public java.lang.String sendDrawdownTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
    	
    	DrawdownTransService drawdownTransService = new DrawdownTransService();
    	List<DrawdownTrans> drawdownTrans = drawdownTransService.getDrawdownTrans();
    	
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
    	String request_mode = transReq.substring(255);

    	double repayment_amount = Double.parseDouble(drawdown_amount)+(Double.parseDouble(drawdownTrans.get(0).getInterestAmount())*100)+(Double.parseDouble(drawdownTrans.get(0).getRepaymentFee())*100);
    	
    	String result_drawdownTrans = drawdown_no+
    			String.format("%-20s",drawdownTrans.get(0).getTradeNavigatorTransactionNo())	+
    			String.format("%-14s",drawdownTrans.get(0).getTradeNavigatorTransactionTimeStamp())+
    			sponsor_ref+	buyer_ref+		drawdown_amount+
    			String.format("%-12s",drawdownTrans.get(0).getInterestAmount())+
    			String.format("%-7s",drawdownTrans.get(0).getRepaymentFee())+
    			String.format("%012.0f",repayment_amount)+
    			String.format("%-2s",drawdownTrans.get(0).getReturnStatus())+
    			String.format("%-3s",drawdownTrans.get(0).getReturnCode())+
    			String.format("%-100s",drawdownTrans.get(0).getReturnMessage());
    	
    	return result_drawdownTrans;
    }

    public java.lang.String sendDebitTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String inqCreditLimit(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String getBuildVersion() throws java.rmi.RemoteException {
        return null;
    }

}
