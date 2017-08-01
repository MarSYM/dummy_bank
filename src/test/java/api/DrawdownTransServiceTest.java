package api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import gec.scf.DrawdownTransService;

public class DrawdownTransServiceTest {

	@Test
	public void when_resave_then_should_return_new_value() {
		DrawdownTrans drawdownTrans = new DrawdownTrans();
		
		drawdownTrans.setTime("1");
		drawdownTrans.setTradeNavigatorTransactionNo("T111132323");
		drawdownTrans.setTradeNavigatorTransactionTimeStamp("20160717104300");
		drawdownTrans.setInterestAmount("500");
		drawdownTrans.setRepaymentFee("20");
		drawdownTrans.setReturnStatus("BE");
		drawdownTrans.setReturnCode("0000");
		drawdownTrans.setReturnMessage("test");
		
		DrawdownTransService drawdownTransService = new DrawdownTransService();
		drawdownTransService.setDrawdownTrans(drawdownTrans);
		List<DrawdownTrans> resultDrawdownList = drawdownTransService.getDrawdownTrans();
		DrawdownTrans resultDrawdown = resultDrawdownList.get(0);
		assertEquals("1",resultDrawdown.getTime());
		assertEquals("T111132323",resultDrawdown.getTradeNavigatorTransactionNo());
		assertEquals("20160717104300",resultDrawdown.getTradeNavigatorTransactionTimeStamp());
		assertEquals("500",resultDrawdown.getInterestAmount());
		assertEquals("20",resultDrawdown.getRepaymentFee());
		assertEquals("BE",resultDrawdown.getReturnStatus());
		assertEquals("0000",resultDrawdown.getReturnCode());
		assertEquals("test",resultDrawdown.getReturnMessage());
		
		DrawdownTrans drawdownTrans2 = new DrawdownTrans();
		
		drawdownTrans2.setTime("2");
		drawdownTrans2.setTradeNavigatorTransactionNo("T1111323232");
		drawdownTrans2.setTradeNavigatorTransactionTimeStamp("201607171043002");
		drawdownTrans2.setInterestAmount("5002");
		drawdownTrans2.setRepaymentFee("202");
		drawdownTrans2.setReturnStatus("BE2");
		drawdownTrans2.setReturnCode("00002");
		drawdownTrans2.setReturnMessage("test2");
		
		drawdownTransService.setDrawdownTrans(drawdownTrans2);
		List<DrawdownTrans> resultDrawdownList2 = drawdownTransService.getDrawdownTrans();
		DrawdownTrans resultDrawdown2 = resultDrawdownList2.get(0);
		assertEquals("2",resultDrawdown2.getTime());
		assertEquals("T1111323232",resultDrawdown2.getTradeNavigatorTransactionNo());
		assertEquals("201607171043002",resultDrawdown2.getTradeNavigatorTransactionTimeStamp());
		assertEquals("5002",resultDrawdown2.getInterestAmount());
		assertEquals("202",resultDrawdown2.getRepaymentFee());
		assertEquals("BE2",resultDrawdown2.getReturnStatus());
		assertEquals("00002",resultDrawdown2.getReturnCode());
		assertEquals("test2",resultDrawdown2.getReturnMessage());
	}

}
