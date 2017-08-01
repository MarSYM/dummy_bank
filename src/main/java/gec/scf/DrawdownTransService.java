package gec.scf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.DrawdownTrans;

@RestController
@RequestMapping(value = "/servives")
public class DrawdownTransService {
	
	public static List<DrawdownTrans> ddTransList = new ArrayList<DrawdownTrans>();

	@RequestMapping(value = "/drawdown", method = RequestMethod.POST)
	public List<DrawdownTrans> setDrawdownTrans(@RequestBody DrawdownTrans drawdownTrans){
		
		if(ddTransList.size()==0)
			ddTransList.add(drawdownTrans);
		else 
			ddTransList.set(0, drawdownTrans);
		
		return getDrawdownTrans();
	}
	
	@RequestMapping(value = "/drawdown", method = RequestMethod.GET)
	public List<DrawdownTrans> getDrawdownTrans(){
		
		if(ddTransList.size()==0)
			ddTransList.add(setDefaultToList());
		
//		System.out.println("getDrawdownTrans()");
		return ddTransList;

	}
	
	public DrawdownTrans setDefaultToList(){
		DrawdownTrans drawdownDefault = new DrawdownTrans();
		
		drawdownDefault.setTime("0");
		drawdownDefault.setTradeNavigatorTransactionNo("TEMP");
		drawdownDefault.setTradeNavigatorTransactionTimeStamp("20160523160000");
		drawdownDefault.setInterestAmount("400");
		drawdownDefault.setRepaymentFee("100");
		drawdownDefault.setReturnStatus("B");
		drawdownDefault.setReturnCode("2");
		drawdownDefault.setReturnMessage("Drawdown Success");
		
		return drawdownDefault;
	}
}

