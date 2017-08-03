package th.co.kbank;

import static org.junit.Assert.*;



import org.junit.Test;

import api.CreditLimit;

import gec.scf.CreditLimitServices;


public class SCFWebServicesSoapImplTestcredit {

	@Test
	public void when_client_and_gateway_gecscf_send_data_then_should_return_data_follow_order() throws java.rmi.RemoteException {
		CreditLimit creditLimit = new CreditLimit();
		
		creditLimit.setTime("1");
		creditLimit.setTnResponseDateTimeStamp("2");
		creditLimit.setCreditLimit("100000");
		creditLimit.setOutstanding("0");
		creditLimit.setRemainingLimit("100000");
		creditLimit.setPendingDrawdownAmount("0");
		creditLimit.setPendingDebitAmount("0");
		creditLimit.setReturnStatus("SI");
		
		CreditLimitServices creditLimitServices = new CreditLimitServices();
		creditLimitServices.setCreditLimit(creditLimit);
		
		SCFWebServicesSoapImpl serviceImpl = new SCFWebServicesSoapImpl();
		String transReq = "ponglert            janyaratipong       AAA11223344556677I";
		String extSysName = "GECeSCF";
		
		String result = serviceImpl.inqCreditLimit(transReq,extSysName);
		System.out.println(result);
		
		assertEquals("ponglert            janyaratipong       AAA2             000010000000000000000000000010000000000000000000000000000000SI",result);
		
	}

}
