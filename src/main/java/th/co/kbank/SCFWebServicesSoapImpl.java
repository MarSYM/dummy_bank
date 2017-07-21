/**
 * SCFWebServicesSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

import java.text.DecimalFormat;

import org.apache.axis.types.UnsignedByte;

import api.DrawdownTrans;
import api.DrawdownTransRepository;

public class SCFWebServicesSoapImpl implements th.co.kbank.SCFWebServicesSoap{
	
    public java.lang.String sendDrawdownTrans(java.lang.String transReq, java.lang.String extSysName) throws java.rmi.RemoteException {
    	
    	DrawdownTransRepository drawdownTransRepository = new DrawdownTransRepository();
    	DrawdownTrans drawdownTrans = drawdownTransRepository.getDrawdownTrans();
    	
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
    	
//    	String drawdown_amount_trim = drawdown_amount.trim();
//    	int result_repayment_amount = Integer.valueOf(drawdown_amount)+
//    			Integer.valueOf(drawdownTrans.getInterestAmount())+
//    			Integer.valueOf(drawdownTrans.getRepaymentFee()) ;
//    	String repayment_amount = String.valueOf(result_repayment_amount);
    	
    	
//    	double drawdown_amount1 = Double.parseDouble(drawdown_amount);
//    	System.out.println("result_repayment_amount : " + drawdown_amount1);
//    	double interestAmount1 = Double.parseDouble(drawdownTrans.getInterestAmount())*100;
//    	System.out.println("interestAmount1 : " + interestAmount1);
//    	double RepaymentFee1 = Double.parseDouble(drawdownTrans.getRepaymentFee())*100;
//    	System.out.println("RepaymentFee1 : " + RepaymentFee1);

    	double repayment_amount = Double.parseDouble(drawdown_amount)+(Double.parseDouble(drawdownTrans.getInterestAmount())*100)+(Double.parseDouble(drawdownTrans.getRepaymentFee())*100);
//    	DecimalFormat mm =  new DecimalFormat("############.##");
//    	System.out.printf("repayment_amount : %.0f\n" ,mm);
    	
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
    	System.out.println("result_drawdownTrans :"+result_drawdownTrans);
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
