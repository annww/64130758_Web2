package ntu.hongdta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentTest {
	@GetMapping("/")
	public String Fragment() {
		return "layout";
	}
}
