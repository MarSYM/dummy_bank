package th.co.kbank;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import api.DrawdownTrans;
import api.DrawdownTransRepository;

public class SCFWebServicesSoapImplTest {

	
	@Test
	public void when_client_and_gateway_gecscf_send_data_then_should_return_data_follow_order() throws java.rmi.RemoteException {
		DrawdownTrans drawdownTrans = new DrawdownTrans();
		
		drawdownTrans.setDelayResponseTime("0");
		drawdownTrans.setTradeNavigatorTransactionNo("T111132323");
		drawdownTrans.setTradeNavigatorTransactionTimeStamp("20160717104300");
		drawdownTrans.setInterestAmount("500");
		drawdownTrans.setRepaymentFee("20");
		drawdownTrans.setReturnStatus("BE");
		drawdownTrans.setReturnCode("000");
		drawdownTrans.setReturnMessage("test");
		
		DrawdownTransRepository drawdownTransRepository = new DrawdownTransRepository();
		drawdownTransRepository.setDrawdownTrans(drawdownTrans);
		DrawdownTrans resultDrawdown = drawdownTransRepository.getDrawdownTrans();
		
		SCFWebServicesSoapImpl serviceImpl = new SCFWebServicesSoapImpl();
		String transReq = "LOAD_TEST_SPONSOR   LOAD_SUPPLIER1      LTAPPROVETXN_01201706131450260024000000002026071020260711               002400000000F02                                                                                                                                N";
		String extSysName = "GECeSCF";
		
		String result = serviceImpl.sendDrawdownTrans(transReq,extSysName);
		
		assertEquals("LTAPPROVETXN_01T111132323          20160717104300LOAD_TEST_SPONSOR   LOAD_SUPPLIER1      002400000000500         20     002400052000BE000test                                                                                                ",result);
		
	}

}
