package gec.scf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.CreditLimit;
//import api.DrawdownTrans;

@RestController
@RequestMapping(value = "/servives")
public class CreditLimitTransServices {
	public static List<CreditLimit> creditLimitList = new ArrayList<CreditLimit>();

	@RequestMapping(value = "/creditLimit", method = RequestMethod.POST)
	public List<CreditLimit> setCreditLimit(@RequestBody CreditLimit creditLimit){
		
		if(creditLimitList.size()==0)
			creditLimitList.add(creditLimit);
		else 
			creditLimitList.set(0, creditLimit);
		
		return getCreditLimit();
	}
	
	@RequestMapping(value = "/creditLimit", method = RequestMethod.GET)
	public List<CreditLimit> getCreditLimit(){
		
		if(creditLimitList.size()==0)
			creditLimitList.add(setDefaultToList());
		
//		System.out.println("getDrawdownTrans()");
		return creditLimitList;

	}
	
	public CreditLimit setDefaultToList(){
		CreditLimit creditLimitDefault = new CreditLimit();
		
		creditLimitDefault.setTime("0");
		creditLimitDefault.setTnResponseDateTimeStamp("20160115160000");
		creditLimitDefault.setCreditLimit("10000000.00");
		creditLimitDefault.setOutstanding("0");
		creditLimitDefault.setRemainingLimit("10000000.00");
		creditLimitDefault.setPendingDrawdownAmount("0");
		creditLimitDefault.setPendingDebitAmount("0");
		creditLimitDefault.setReturnStatus("SI");
		
		return creditLimitDefault;
	}

}
