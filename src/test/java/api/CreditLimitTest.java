package api;

import static org.junit.Assert.*;

import org.junit.Test;

import api.CreditLimit;
public class CreditLimitTest {

	@Test
	public void test_class_CreditLimit() {
		CreditLimit test = new CreditLimit();
		
		test.setTime("1");
		test.setTnResponseDateTimeStamp("2");
		test.setCreditLimit("100000");
		test.setOutstanding("0");
		test.setRemainingLimit("100000");
		test.setPendingDrawdownAmount("0");
		test.setPendingDebitAmount("0");
		test.setReturnStatus("SI");
		
		assertEquals("1",test.getTime());
		assertEquals("2",test.getTnResponseDateTimeStamp());
		assertEquals("100000",test.getCreditLimit());
		assertEquals("0",test.getOutstanding());
		assertEquals("100000",test.getRemainingLimit());
		assertEquals("0",test.getPendingDrawdownAmount());
		assertEquals("0",test.getPendingDebitAmount());
		assertEquals("SI",test.getReturnStatus());
	}

}
