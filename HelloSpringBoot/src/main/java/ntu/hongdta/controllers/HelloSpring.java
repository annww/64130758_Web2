package ntu.hongdta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpring {
	//action method
		//URL call action
		@RequestMapping("/chao")
		public String xin_Chao(ModelMap model) {
			model.addAttribute("mess","Welcome to my website");
			// return helloView -> view is helloView.html
			return "helloView";
		}
}
