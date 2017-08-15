package th.co.kbank;

import static org.junit.Assert.*;

import org.junit.Test;

import api.DebitTrans;
import gec.scf.DebitTransServices;

public class SCFWebServicesSoapImplTestdebittrans {

	@Test
	public void when_client_and_gateway_gecscf_send_data_then_should_return_data_follow_order() throws java.rmi.RemoteException {
			DebitTrans db = new DebitTrans();
		
			db.setTime("1");
			db.setPaymentTransactionNo("5");
			db.setTnTransactionTimeStamp("6");
			db.setDebitFee("10.00");
			db.setDebitAmount("10.00");
			db.setReturnStatus("DS");
			db.setReturnCode("1");
			db.setReturnMessage("1");
			db.setLoanTransactionNo("10.00");
			db.setDrawdownDate("10.00");
			db.setMaturityDate("10.00");
			db.setDrawdownAmount("10.00");
			db.setInterestAmount("10.00");
			db.setRepaymentFee("10.00");
			db.setPaymentTransactionNo2("2");
			db.setTnTransactionTimeStamp2("2");
			db.setDebitFee2("2");
			db.setDebitAmount2("2");
			db.setReturnStatus2("DS");
			db.setReturnCode2("2");
			db.setReturnMessage2("2");
			db.setLoanTransactionNo2("2");
			db.setDrawdownDate2("2");
			db.setMaturityDate2("2");
			db.setDrawdownAmount2("2");
			db.setInterestAmount2("2");
			db.setRepaymentFee2("2");
			
			DebitTransServices debitTransServices = new DebitTransServices();
			debitTransServices.setDebitTrans(db);
			
			SCFWebServicesSoapImpl serviceImpl = new SCFWebServicesSoapImpl();
			String transReq = "aaa            bbbbb               ccccc               ddddd               12345       12345         12345678ab12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678N";
			String extSysName = "GECeSCF";
			
			String result = serviceImpl.sendDebitTrans(transReq,extSysName);
			System.out.println(result);
	}

}
