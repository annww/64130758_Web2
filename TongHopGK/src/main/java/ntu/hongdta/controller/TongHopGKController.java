package ntu.hongdta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TongHopGKController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/list")
	public String list() {
		return "list";
	}
	
	@GetMapping("/addNew")
	public String addNew() {
		return "addNew";
	}

	
}
