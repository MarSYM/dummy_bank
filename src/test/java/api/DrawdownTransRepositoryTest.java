package api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import gec.scf.DrawdownTransService;

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
		
		DrawdownTransService drawdownTransService = new DrawdownTransService();
		drawdownTransService.setDrawdownTrans(drawdownTrans);
		List<DrawdownTrans> resultDrawdown = drawdownTransService.getDrawdownTrans();
		
		assertEquals("1",resultDrawdown.get(0).getDelayResponseTime());
		assertEquals("T111132323",resultDrawdown.get(0).getTradeNavigatorTransactionNo());
		assertEquals("20160717104300",resultDrawdown.get(0).getTradeNavigatorTransactionTimeStamp());
		assertEquals("500",resultDrawdown.get(0).getInterestAmount());
		assertEquals("20",resultDrawdown.get(0).getRepaymentFee());
		assertEquals("BE",resultDrawdown.get(0).getReturnStatus());
		assertEquals("0000",resultDrawdown.get(0).getReturnCode());
		assertEquals("test",resultDrawdown.get(0).getReturnMessage());
		
		DrawdownTrans drawdownTrans2 = new DrawdownTrans();
		
		drawdownTrans2.setDelayResponseTime("2");
		drawdownTrans2.setTradeNavigatorTransactionNo("T1111323232");
		drawdownTrans2.setTradeNavigatorTransactionTimeStamp("201607171043002");
		drawdownTrans2.setInterestAmount("5002");
		drawdownTrans2.setRepaymentFee("202");
		drawdownTrans2.setReturnStatus("BE2");
		drawdownTrans2.setReturnCode("00002");
		drawdownTrans2.setReturnMessage("test2");
		
		drawdownTransService.setDrawdownTrans(drawdownTrans2);
		List<DrawdownTrans> resultDrawdown2 = drawdownTransService.getDrawdownTrans();
		
		assertEquals("2",resultDrawdown2.get(0).getDelayResponseTime());
		assertEquals("T1111323232",resultDrawdown2.get(0).getTradeNavigatorTransactionNo());
		assertEquals("201607171043002",resultDrawdown2.get(0).getTradeNavigatorTransactionTimeStamp());
		assertEquals("5002",resultDrawdown2.get(0).getInterestAmount());
		assertEquals("202",resultDrawdown2.get(0).getRepaymentFee());
		assertEquals("BE2",resultDrawdown2.get(0).getReturnStatus());
		assertEquals("00002",resultDrawdown2.get(0).getReturnCode());
		assertEquals("test2",resultDrawdown2.get(0).getReturnMessage());
	}

}
