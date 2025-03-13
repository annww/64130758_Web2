package ntu.hongdta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BMIController {
	@GetMapping("/bmi")
	public ModelAndView showPageBMI() {
		return new ModelAndView("/bmi");
	}
	
	@PostMapping("/bmi")
	public ModelAndView BMI() {
		
		return new ModelAndView("/bmi");
	}
}
