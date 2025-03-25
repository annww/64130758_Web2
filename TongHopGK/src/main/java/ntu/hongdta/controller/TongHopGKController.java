package ntu.hongdta.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import ntu.hongdta.model.SinhVien;


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
	
	ArrayList<SinhVien> sinhViens = new ArrayList<>();
	
	public TongHopGKController() {
		sinhViens.add(new SinhVien("SV1","Dương Thị Ánh Hồng",20,"CNTT"));
		sinhViens.add(new SinhVien("SV2", "Vi An", 19, "Kinh tế"));
		sinhViens.add(new SinhVien("SV3", "Mộc Miên", 19, "Kinh tế"));
		sinhViens.add(new SinhVien("SV4", "An Tuệ", 18, "Ngân hàng"));
	}
	
	
	@GetMapping("/list")
	public String list(Model model) {		
		model.addAttribute("sinhViens", sinhViens);
		return "list";
	}
	
	@GetMapping("/addNew")
	public String addNew() {
		return "addNew";
	}

	@PostMapping("/addStudent")
	public String addStudent(@RequestParam("id") String id, 
			@RequestParam("name") String name,
			@RequestParam("age") int age,
			@RequestParam("major") String major){
		SinhVien newStudent = new SinhVien(id, name, age, major);
		sinhViens.add(newStudent);
		return "redirect:/list";
	}
}
