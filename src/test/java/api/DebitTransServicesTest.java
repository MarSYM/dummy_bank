package api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import gec.scf.DebitTransServices;


public class DebitTransServicesTest {

	@Test
	public void when_resave_then_should_return_new_value() {
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
			
			DebitTransServices debitTransServices = new DebitTransServices();
			debitTransServices.setDebitTrans(db);
			List<DebitTrans> resultDebitTransList = debitTransServices.getDebitTrans();
			DebitTrans resultDebitTrans = resultDebitTransList.get(0);
			
			assertEquals("1",resultDebitTrans.getTime());
			assertEquals("1",resultDebitTrans.getPaymentTransactionNo());
			assertEquals("1",resultDebitTrans.getTnTransactionTimeStamp());
			assertEquals("1",resultDebitTrans.getDebitFee());
			assertEquals("1",resultDebitTrans.getDebitAmount());
			assertEquals("1",resultDebitTrans.getReturnStatus());
			assertEquals("1",resultDebitTrans.getReturnCode());
			assertEquals("1",resultDebitTrans.getReturnMessage());
			assertEquals("1",resultDebitTrans.getLoanTransactionNo());
			assertEquals("1",resultDebitTrans.getDrawdownDate());
			assertEquals("1",resultDebitTrans.getMaturityDate());
			assertEquals("1",resultDebitTrans.getDrawdownAmount());
			assertEquals("1",resultDebitTrans.getInterestAmount());
			assertEquals("1",resultDebitTrans.getRepaymentFee());
			assertEquals("1",resultDebitTrans.getPaymentTransactionNo2());
			assertEquals("1",resultDebitTrans.getTnTransactionTimeStamp2());
			assertEquals("1",resultDebitTrans.getDebitFee2());
			assertEquals("1",resultDebitTrans.getDebitAmount2());
			assertEquals("1",resultDebitTrans.getReturnStatus2());
			assertEquals("1",resultDebitTrans.getReturnCode2());
			assertEquals("1",resultDebitTrans.getReturnMessage2());
			assertEquals("1",resultDebitTrans.getLoanTransactionNo2());
			assertEquals("1",resultDebitTrans.getDrawdownDate2());
			assertEquals("1",resultDebitTrans.getMaturityDate2());
			assertEquals("1",resultDebitTrans.getDrawdownAmount2());
			assertEquals("1",resultDebitTrans.getInterestAmount2());
			assertEquals("1",resultDebitTrans.getRepaymentFee2());
			
			DebitTrans db2 = new DebitTrans();
			
			db2.setTime("2");
			db2.setPaymentTransactionNo("2");
			db2.setTnTransactionTimeStamp("2");
			db2.setDebitFee("2");
			db2.setDebitAmount("2");
			db2.setReturnStatus("2");
			db2.setReturnCode("2");
			db2.setReturnMessage("2");
			db2.setLoanTransactionNo("2");
			db2.setDrawdownDate("2");
			db2.setMaturityDate("2");
			db2.setDrawdownAmount("2");
			db2.setInterestAmount("2");
			db2.setRepaymentFee("2");
			db2.setPaymentTransactionNo2("2");
			db2.setTnTransactionTimeStamp2("2");
			db2.setDebitFee2("2");
			db2.setDebitAmount2("2");
			db2.setReturnStatus2("2");
			db2.setReturnCode2("2");
			db2.setReturnMessage2("2");
			db2.setLoanTransactionNo2("2");
			db2.setDrawdownDate2("2");
			db2.setMaturityDate2("2");
			db2.setDrawdownAmount2("2");
			db2.setInterestAmount2("2");
			db2.setRepaymentFee2("2");
			
			debitTransServices.setDebitTrans(db2);
			List<DebitTrans> resultDebitTransList2 = debitTransServices.getDebitTrans();
			DebitTrans resultDebitTrans2 = resultDebitTransList2.get(0);
			
			assertEquals("2",resultDebitTrans2.getTime());
			assertEquals("2",resultDebitTrans2.getPaymentTransactionNo());
			assertEquals("2",resultDebitTrans2.getTnTransactionTimeStamp());
			assertEquals("2",resultDebitTrans2.getDebitFee());
			assertEquals("2",resultDebitTrans2.getDebitAmount());
			assertEquals("2",resultDebitTrans2.getReturnStatus());
			assertEquals("2",resultDebitTrans2.getReturnCode());
			assertEquals("2",resultDebitTrans2.getReturnMessage());
			assertEquals("2",resultDebitTrans2.getLoanTransactionNo());
			assertEquals("2",resultDebitTrans2.getDrawdownDate());
			assertEquals("2",resultDebitTrans2.getMaturityDate());
			assertEquals("2",resultDebitTrans2.getDrawdownAmount());
			assertEquals("2",resultDebitTrans2.getInterestAmount());
			assertEquals("2",resultDebitTrans2.getRepaymentFee());
			assertEquals("2",resultDebitTrans2.getPaymentTransactionNo2());
			assertEquals("2",resultDebitTrans2.getTnTransactionTimeStamp2());
			assertEquals("2",resultDebitTrans2.getDebitFee2());
			assertEquals("2",resultDebitTrans2.getDebitAmount2());
			assertEquals("2",resultDebitTrans2.getReturnStatus2());
			assertEquals("2",resultDebitTrans2.getReturnCode2());
			assertEquals("2",resultDebitTrans2.getReturnMessage2());
			assertEquals("2",resultDebitTrans2.getLoanTransactionNo2());
			assertEquals("2",resultDebitTrans2.getDrawdownDate2());
			assertEquals("2",resultDebitTrans2.getMaturityDate2());
			assertEquals("2",resultDebitTrans2.getDrawdownAmount2());
			assertEquals("2",resultDebitTrans2.getInterestAmount2());
			assertEquals("2",resultDebitTrans2.getRepaymentFee2());
			
			
	}

}
