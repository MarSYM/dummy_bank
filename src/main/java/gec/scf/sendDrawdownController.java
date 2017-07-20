package gec.scf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sendDrawdownController {
	
	@RequestMapping(value="/bankdummy.html")
	public ModelAndView scondPage() {
		return new ModelAndView("bankdummy");
	}
	
	
	@RequestMapping(value="/sendDrawdownTrans.html")
	public ModelAndView firstPage() {
		return new ModelAndView("sendDrawdownTrans");
	}
}

	

