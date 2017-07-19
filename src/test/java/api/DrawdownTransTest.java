package api;

import static org.junit.Assert.*;
import api.DrawdownTrans;
import org.junit.Test;

public class DrawdownTransTest {
	
	@Test
	public void test_class_drawdown_trans() {
		DrawdownTrans data = new DrawdownTrans();
		
		data.setDelayResponseTime("1");
		data.setTradeNavigatorTransactionNo("T111132323");
		data.setTradeNavigatorTransactionTimeStamp("20160717104300");
		data.setInterestAmount("500");
		data.setRepaymentFee("20");
		data.setReturnStatus("BE");
		data.setReturnCode("0000");
		data.setReturnMessage("test");
		
		assertEquals("1",data.getDelayResponseTime());
		assertEquals("T111132323",data.getTradeNavigatorTransactionNo());
		assertEquals("20160717104300",data.getTradeNavigatorTransactionTimeStamp());
		assertEquals("500",data.getInterestAmount());
		assertEquals("20",data.getRepaymentFee());
		assertEquals("BE",data.getReturnStatus());
		assertEquals("0000",data.getReturnCode());
		assertEquals("test",data.getReturnMessage());
	}

}
