package th.co.kbank;

import static org.junit.Assert.*;

import org.junit.Test;

import api.DrawdownTrans;
import gec.scf.DrawdownTransService;

public class SCFWebServicesSoapImplTestinqdd {

	@Test
	public void when_client_and_gateway_gecscf_send_data_then_should_return_data_follow_order() throws java.rmi.RemoteException {
		DrawdownTrans drawdownTrans = new DrawdownTrans();
		
		drawdownTrans.setTime("0");
		drawdownTrans.setTradeNavigatorTransactionNo("T111132323");
		drawdownTrans.setTradeNavigatorTransactionTimeStamp("20160717104300");
		drawdownTrans.setInterestAmount("500");
		drawdownTrans.setRepaymentFee("20");
		drawdownTrans.setReturnStatus("BE");
		drawdownTrans.setReturnCode("000");
		drawdownTrans.setReturnMessage("test");
		
		drawdownTrans.setTradeNavigatorTransactionNo2("1");
		drawdownTrans.setTradeNavigatorTransactionTimeStamp2("2");
		drawdownTrans.setInterestAmount2("3");
		drawdownTrans.setRepaymentFee2("4");
		drawdownTrans.setReturnStatus2("5");
		drawdownTrans.setReturnCode2("6");
		drawdownTrans.setReturnMessage2("test");
		
		DrawdownTransService drawdownTransService = new DrawdownTransService();
		drawdownTransService.setDrawdownTrans(drawdownTrans);
//		 List<DrawdownTrans> resultDrawdown = drawdownTransRepository.getDrawdownTrans();
		
		SCFWebServicesSoapImpl serviceImpl = new SCFWebServicesSoapImpl();
		String transReq = "LOAD_TEST_SPONSOR   LOAD_SUPPLIER1      LTAPPROVETXN_01201706131450260024000000002026071020260711               002400000000F02                                                                                                                                I";
		String extSysName = "GECeSCF";
		
		String result = serviceImpl.sendDrawdownTrans(transReq,extSysName);
		System.out.println(result);
		
		
		assertEquals("LTAPPROVETXN_011                   2             LOAD_TEST_SPONSOR   LOAD_SUPPLIER1      0024000000003           4      0024000007005 6  test                                                                                                ",result);
		
	}
}
