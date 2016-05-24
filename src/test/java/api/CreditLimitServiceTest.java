package api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import api.CreditLimit;
import gec.scf.CreditLimitServices;



public class CreditLimitServiceTest {

	@Test
	public void when_resave_then_should_return_new_value() {
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
		List<CreditLimit> resultCreditLimitList = creditLimitServices.getCreditLimit();
		CreditLimit resultCreditLimit = resultCreditLimitList.get(0);
		assertEquals("1",resultCreditLimit.getTime());
		assertEquals("2",resultCreditLimit.getTnResponseDateTimeStamp());
		assertEquals("100000",resultCreditLimit.getCreditLimit());
		assertEquals("0",resultCreditLimit.getOutstanding());
		assertEquals("100000",resultCreditLimit.getRemainingLimit());
		assertEquals("0",resultCreditLimit.getPendingDrawdownAmount());
		assertEquals("0",resultCreditLimit.getPendingDebitAmount());
		assertEquals("SI",resultCreditLimit.getReturnStatus());
		
		CreditLimit creditLimit2 = new CreditLimit();
		
		creditLimit2.setTime("2");
		creditLimit2.setTnResponseDateTimeStamp("3");
		creditLimit2.setCreditLimit("200000");
		creditLimit2.setOutstanding("0");
		creditLimit2.setRemainingLimit("200000");
		creditLimit2.setPendingDrawdownAmount("0");
		creditLimit2.setPendingDebitAmount("0");
		creditLimit2.setReturnStatus("SI");
		
		
		creditLimitServices.setCreditLimit(creditLimit2);
		List<CreditLimit> resultCreditLimitList2 = creditLimitServices.getCreditLimit();
		CreditLimit resultCreditLimit2 = resultCreditLimitList2.get(0);
		assertEquals("2",resultCreditLimit2.getTime());
		assertEquals("3",resultCreditLimit2.getTnResponseDateTimeStamp());
		assertEquals("200000",resultCreditLimit2.getCreditLimit());
		assertEquals("0",resultCreditLimit2.getOutstanding());
		assertEquals("200000",resultCreditLimit2.getRemainingLimit());
		assertEquals("0",resultCreditLimit2.getPendingDrawdownAmount());
		assertEquals("0",resultCreditLimit2.getPendingDebitAmount());
		assertEquals("SI",resultCreditLimit2.getReturnStatus());
	}

}
