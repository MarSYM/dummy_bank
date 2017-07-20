package api;

import static org.junit.Assert.*;

import org.junit.Test;

public class DrawdownTransRepositoryTest {

	@Test
	public void when_resave_then_should_return_new_value() {
		DrawdownTrans drawdownTrans = new DrawdownTrans();
		
		drawdownTrans.setDelayResponseTime("1");
		drawdownTrans.setTradeNavigatorTransactionNo("T111132323");
		drawdownTrans.setTradeNavigatorTransactionTimeStamp("20160717104300");
		drawdownTrans.setInterestAmount("500");
		drawdownTrans.setRepaymentFee("20");
		drawdownTrans.setReturnStatus("BE");
		drawdownTrans.setReturnCode("0000");
		drawdownTrans.setReturnMessage("test");
		
		DrawdownTransRepository drawdownTransRepository = new DrawdownTransRepository();
		drawdownTransRepository.setDrawdownTrans(drawdownTrans);
		DrawdownTrans resultDrawdown = drawdownTransRepository.getDrawdownTrans();
		
		assertEquals("1",resultDrawdown.getDelayResponseTime());
		assertEquals("T111132323",resultDrawdown.getTradeNavigatorTransactionNo());
		assertEquals("20160717104300",resultDrawdown.getTradeNavigatorTransactionTimeStamp());
		assertEquals("500",resultDrawdown.getInterestAmount());
		assertEquals("20",resultDrawdown.getRepaymentFee());
		assertEquals("BE",resultDrawdown.getReturnStatus());
		assertEquals("0000",resultDrawdown.getReturnCode());
		assertEquals("test",resultDrawdown.getReturnMessage());
		
		DrawdownTrans drawdownTrans2 = new DrawdownTrans();
		
		drawdownTrans2.setDelayResponseTime("2");
		drawdownTrans2.setTradeNavigatorTransactionNo("T1111323232");
		drawdownTrans2.setTradeNavigatorTransactionTimeStamp("201607171043002");
		drawdownTrans2.setInterestAmount("5002");
		drawdownTrans2.setRepaymentFee("202");
		drawdownTrans2.setReturnStatus("BE2");
		drawdownTrans2.setReturnCode("00002");
		drawdownTrans2.setReturnMessage("test2");
		
		drawdownTransRepository.setDrawdownTrans(drawdownTrans2);
		DrawdownTrans resultDrawdown2 = drawdownTransRepository.getDrawdownTrans();
		
		assertEquals("2",resultDrawdown2.getDelayResponseTime());
		assertEquals("T1111323232",resultDrawdown2.getTradeNavigatorTransactionNo());
		assertEquals("201607171043002",resultDrawdown2.getTradeNavigatorTransactionTimeStamp());
		assertEquals("5002",resultDrawdown2.getInterestAmount());
		assertEquals("202",resultDrawdown2.getRepaymentFee());
		assertEquals("BE2",resultDrawdown2.getReturnStatus());
		assertEquals("00002",resultDrawdown2.getReturnCode());
		assertEquals("test2",resultDrawdown2.getReturnMessage());
	}

}
