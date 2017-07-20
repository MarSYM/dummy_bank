package api;

import java.util.ArrayList;
import java.util.List;

public class DrawdownTransRepository {
	
	public static List<DrawdownTrans> ddTransList = new ArrayList<DrawdownTrans>();
	
	
	public void setDrawdownTrans(DrawdownTrans drawdownTrans){
//		System.out.println("size "+ddTransList.size());
		if(ddTransList.size()==0){
//			System.out.println("size 0 "+ddTransList.size());
			ddTransList.add(drawdownTrans);
		}
		else {
//			System.out.println("else "+ddTransList.size());
			ddTransList.set(0, drawdownTrans);
		}
			
	}
	
	public DrawdownTrans getDrawdownTrans(){
		
		return ddTransList.get(0);
	}
}
