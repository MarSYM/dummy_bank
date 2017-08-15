package gec.scf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    private String appMode;

    @Autowired
    public ViewController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/drawdown")
    public String drawdownpage(Model model){

        return "index";
    }
    
    @RequestMapping("/inqcreditlimit")
    public String inqpage(Model model){

        return "inqcreditlimit";
    }
    
    @RequestMapping("/debittrans")
    public String debittranspage(Model model){

        return "debittrans";
    }
    
}
