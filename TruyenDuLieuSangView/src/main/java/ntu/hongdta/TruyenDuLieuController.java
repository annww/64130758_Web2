package ntu.hongdta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TruyenDuLieuController {
	@RequestMapping("/truyendulieu")
	public String sinhVien(ModelMap model) {
		model.addAttribute("HoTen","Duong Thi Anh Hong");
		return "sinhVien";
		
	}
	
}
