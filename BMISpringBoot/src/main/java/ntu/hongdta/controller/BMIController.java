package ntu.hongdta.controller;

import java.net.Authenticator.RequestorType;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;
import ntu.hongdta.service.BMIService;

@Controller
public class BMIController {
	@Autowired
	private BMIService bmiService;
	
	
	@GetMapping("/bmi")
	public String showPageBMI() {
		return "/bmi";
	}
	
	@PostMapping("/bmi")
	public String BMI(@RequestParam double weight, @RequestParam double height, ModelMap model) {
		double bmi = bmiService.calculateBMI(weight, height);
		String category = bmiService.getBMICategory(bmi);
		
		model.addAttribute("bmi",bmi);
		model.addAttribute("category", category);
		return "/bmi";
	}
}
