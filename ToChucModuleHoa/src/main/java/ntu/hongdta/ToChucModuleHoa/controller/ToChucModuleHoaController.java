package ntu.hongdta.ToChucModuleHoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToChucModuleHoaController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/aboutme")
	public String about() {
		return "aboutme";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
