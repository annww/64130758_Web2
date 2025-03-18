package ntu.hongdta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;


@Controller
public class BTTongHop {
	@GetMapping("/")
	public String getDLfromView(ModelMap m) {
		m.addAttribute("username","Ánh Hồng");
		return "BTTongHop";
	}
	
	@RequestMapping(value="/return", method= org.springframework.web.bind.annotation.RequestMethod.POST)
	public String TDLView(ModelMap m,
		@RequestParam("name") String name) {
		m.addAttribute("newhoten", name);
		return "BTTongHop";
	}
	
	
}
