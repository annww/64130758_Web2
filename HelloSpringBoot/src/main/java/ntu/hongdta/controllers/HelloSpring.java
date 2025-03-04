package ntu.hongdta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpring {
	//action method
		//URL call action
		@RequestMapping("/chao")
		public String xin_Chao() {
			// return helloView -> view is helloView.html
			return "helloView";
		}
}
