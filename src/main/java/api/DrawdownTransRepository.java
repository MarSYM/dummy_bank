package api;

import java.util.ArrayList;
import java.util.List;

public class DrawdownTransRepository {
	
//	public static List<DrawdownTrans> ddTransList = new ArrayList<DrawdownTrans>();
	public static DrawdownTrans drawdownTransStatic = new DrawdownTrans();
	
	public void setDrawdownTrans(DrawdownTrans drawdownTrans){
//		if(ddTransList.size()==0)
//			ddTransList.add(drawdownTrans);
//		else 
//			ddTransList.set(0, drawdownTrans);
		drawdownTransStatic = drawdownTrans;
	}
	
	public DrawdownTrans getDrawdownTrans(){
//		return ddTransList.get(0);
		return drawdownTransStatic;
	}
}
