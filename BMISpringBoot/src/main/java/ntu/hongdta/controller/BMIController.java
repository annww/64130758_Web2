package ntu.hongdta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ntu.hongdta.service.BMIService;

@Controller
public class BMIController {

    private final BMIService bmiService;

    @Autowired
    public BMIController(BMIService bmiService) {
        this.bmiService = bmiService;
    }

    @GetMapping("/bmi")
    public String showPageBMI() {
        return "bmi"; 
    }

    @PostMapping("/bmi")
    public String calculateBMI(@RequestParam double weight, 
                               @RequestParam double height, 
                               @RequestParam(required = false, defaultValue = "false") boolean isAsian,
                               Model model) {
        double bmi = bmiService.calculateBMI(weight, height);
        String category = bmiService.getBMICategory(bmi, isAsian);
        
        model.addAttribute("bmi", bmi);
        model.addAttribute("category", category);
        model.addAttribute("isAsian", isAsian);
        
        return "bmi";
    }
}
