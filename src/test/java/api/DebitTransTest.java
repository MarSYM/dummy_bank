package api;

import static org.junit.Assert.*;

import org.junit.Test;

public class DebitTransTest {

	@Test
	public void test_class_debit_trans() {
		DebitTrans db = new DebitTrans();
		
		db.setTime("1");
		db.setPaymentTransactionNo("1");
		db.setTnTransactionTimeStamp("1");
		db.setDebitFee("1");
		db.setDebitAmount("1");
		db.setReturnStatus("1");
		db.setReturnCode("1");
		db.setReturnMessage("1");
		db.setLoanTransactionNo("1");
		db.setDrawdownDate("1");
		db.setMaturityDate("1");
		db.setDrawdownAmount("1");
		db.setInterestAmount("1");
		db.setRepaymentFee("1");
		db.setPaymentTransactionNo2("1");
		db.setTnTransactionTimeStamp2("1");
		db.setDebitFee2("1");
		db.setDebitAmount2("1");
		db.setReturnStatus2("1");
		db.setReturnCode2("1");
		db.setReturnMessage2("1");
		db.setLoanTransactionNo2("1");
		db.setDrawdownDate2("1");
		db.setMaturityDate2("1");
		db.setDrawdownAmount2("1");
		db.setInterestAmount2("1");
		db.setRepaymentFee2("1");
		
		
		assertEquals("1",db.getTime());
		assertEquals("1",db.getPaymentTransactionNo());
		assertEquals("1",db.getTnTransactionTimeStamp());
		assertEquals("1",db.getDebitFee());
		assertEquals("1",db.getDebitAmount());
		assertEquals("1",db.getReturnStatus());
		assertEquals("1",db.getReturnCode());
		assertEquals("1",db.getReturnMessage());
		assertEquals("1",db.getLoanTransactionNo());
		assertEquals("1",db.getDrawdownDate());
		assertEquals("1",db.getMaturityDate());
		assertEquals("1",db.getDrawdownAmount());
		assertEquals("1",db.getInterestAmount());
		assertEquals("1",db.getRepaymentFee());
		assertEquals("1",db.getPaymentTransactionNo2());
		assertEquals("1",db.getTnTransactionTimeStamp2());
		assertEquals("1",db.getDebitFee2());
		assertEquals("1",db.getDebitAmount2());
		assertEquals("1",db.getReturnStatus2());
		assertEquals("1",db.getReturnCode2());
		assertEquals("1",db.getReturnMessage2());
		assertEquals("1",db.getLoanTransactionNo2());
		assertEquals("1",db.getDrawdownDate2());
		assertEquals("1",db.getMaturityDate2());
		assertEquals("1",db.getDrawdownAmount2());
		assertEquals("1",db.getInterestAmount2());
		assertEquals("1",db.getRepaymentFee2());
		
		
	}

}
