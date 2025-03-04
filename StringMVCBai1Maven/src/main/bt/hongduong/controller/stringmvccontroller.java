package bt.hongduong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class stringmvccontroller {
	@RequestMapping("/display")
	public ModelAndView getPage() {
		ModelAndView modelAndView = new ModelAndView();
		m.setViewName("welcome");
		return m;
	}
}
