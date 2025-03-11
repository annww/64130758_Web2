package ntu.hongdta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TruyenDuLieuController {
	@RequestMapping("/truyendulieu")
	public String sinhVien(ModelMap model) {
		model.addAttribute("hoTen","Duong Thi Anh Hong");
		model.addAttribute("namSinh","2004");
		model.addAttribute("gioiTinh","Nu");
		return "sinhVien";
	}
}
