package gec.scf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import api.DebitTrans;

@RestController
@RequestMapping(value = "/servives")
public class DebitTransServices {
	public static List<DebitTrans> debitTransList = new ArrayList<DebitTrans>();

	@RequestMapping(value = "/debitTrans", method = RequestMethod.POST)
	public List<DebitTrans> setDebitTrans(@RequestBody DebitTrans debitTrans){
		
		if(debitTransList.size()==0)
			debitTransList.add(debitTrans);
		else 
			debitTransList.set(0, debitTrans);
		
		return getDebitTrans();
	}
	
	@RequestMapping(value = "/debitTrans", method = RequestMethod.GET)
	public List<DebitTrans> getDebitTrans(){
		
		if(debitTransList.size()==0)
			debitTransList.add(setDefaultToList());
		
//		System.out.println("getDrawdownTrans()");
		return debitTransList;

	}
	
	public DebitTrans setDefaultToList(){
		DebitTrans debitTransDefault = new DebitTrans();
		
		debitTransDefault.setTime("0");
		debitTransDefault.setPaymentTransactionNo("");
		debitTransDefault.setTnTransactionTimeStamp("");
		debitTransDefault.setDebitFee("");
		debitTransDefault.setDebitAmount("");
		debitTransDefault.setReturnStatus("");
		debitTransDefault.setReturnCode("");
		debitTransDefault.setReturnMessage("");
		debitTransDefault.setLoanTransactionNo("");
		debitTransDefault.setDrawdownDate("");
		debitTransDefault.setMaturityDate("");
		debitTransDefault.setDrawdownAmount("");
		debitTransDefault.setInterestAmount("");
		debitTransDefault.setRepaymentFee("");
		debitTransDefault.setPaymentTransactionNo2("");
		debitTransDefault.setTnTransactionTimeStamp2("");
		debitTransDefault.setDebitFee2("");
		debitTransDefault.setDebitAmount2("");
		debitTransDefault.setReturnStatus2("");
		debitTransDefault.setReturnCode2("");
		debitTransDefault.setReturnMessage2("");
		debitTransDefault.setLoanTransactionNo2("");
		debitTransDefault.setDrawdownDate2("");
		debitTransDefault.setMaturityDate2("");
		debitTransDefault.setDrawdownAmount2("");
		debitTransDefault.setInterestAmount2("");
		debitTransDefault.setRepaymentFee2("");
		
		
		
		return debitTransDefault;
	}


}
