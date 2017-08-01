/**
 * SCFWebServicesSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.kbank;

import java.util.List;

//import api.DelayTime;
import api.DrawdownTrans;
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
    	String request_mode = transReq.substring(255);

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
    	
//     	String delaytime = drawdownTrans.getDelayResponseTime();
//     	long time = Long.parseLong(delaytime);
//     	time = time*1000;
//     	DelayTime delayTime = new DelayTime();
//     	try {
//			delayTime.Sleep_Working_On_delayResponseTimeTime(time);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
