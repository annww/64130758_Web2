package thiGK.ntu64130758.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DuongThiAnhHong_ThiGiuaKyController {
	@GetMapping("/")
	public String home() {
		return"home";
	}
}
