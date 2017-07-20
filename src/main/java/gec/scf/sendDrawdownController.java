package gec.scf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sendDrawdownController {

	@RequestMapping("/sendDrawdownTrans.html")
	public ModelAndView firstPage() {
		System.out.print("0000");
		return new ModelAndView("sendDrawdownTrans");
	}
}
