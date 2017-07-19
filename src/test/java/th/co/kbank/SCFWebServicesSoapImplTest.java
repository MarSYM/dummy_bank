package th.co.kbank;

import static org.junit.Assert.*;

import org.junit.Test;

public class SCFWebServicesSoapImplTest {

	
	@Test
	public void test() {
		SCFWebServicesSoapImpl serviceImpl = new SCFWebServicesSoapImpl();
		String transReq = "LOAD_TEST_SPONSOR   LOAD_SUPPLIER1      LTAPPROVETXN_01201706131450260024000000002026071020260711               002400000000F02                                                                                                                                N";
		String extSysName = "GECeSCF";
		
//		String result = serviceImpl.sendDebitTrans(transReq, extSysName);
		
		
	}

}
