package gec.scf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.DrawdownTrans;

@RestController
@RequestMapping(value = "/servives")
public class DrawdownTransService {
	
	public static List<DrawdownTrans> ddTransList = new ArrayList<DrawdownTrans>();

	@RequestMapping(value = "/drawdown1", method = RequestMethod.POST)
	public void setDrawdownTrans(DrawdownTrans drawdownTrans){
		if(ddTransList.size()==0)
			ddTransList.add(drawdownTrans);
		else 
			ddTransList.set(0, drawdownTrans);
	}
	
	@RequestMapping(value = "/drawdown", method = RequestMethod.GET)
	public List<DrawdownTrans> getDrawdownTrans(){
		System.out.println("getDrawdownTrans()");
		return ddTransList;

	}
}

