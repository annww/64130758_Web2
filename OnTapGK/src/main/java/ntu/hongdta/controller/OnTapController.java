package ntu.hongdta.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ntu.hongdta.model.SinhVien;

@Controller
public class OnTapController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	ArrayList<SinhVien> sinhViens = new ArrayList<>();
	
	
	public OnTapController() {
		sinhViens.add(new SinhVien("SV1","Dương Thị Ánh Hồng","11/10/2004","CNTT"));
		sinhViens.add(new SinhVien("SV2", "Vi An", "13/07/2004", "Kinh tế"));
		sinhViens.add(new SinhVien("SV3", "Thanh Tùng", "21/09/2004", "CNSH"));
		sinhViens.add(new SinhVien("SV4", "An Tuệ", "26/02/2000", "Ngân hàng"));
	}
	
	@GetMapping("/list")
	public String list(Model model) {		
		model.addAttribute("sinhViens", sinhViens);
		return "list";
	}
	
	@GetMapping("/addnew")
	public String addNew() {
		return "addnew";
	}

	@PostMapping("/addstudent")
	public String addStudent(@RequestParam("id") String id, 
			@RequestParam("name") String name,
			@RequestParam("dob") String dob,
			@RequestParam("major") String major){
		SinhVien newStudent = new SinhVien(id, name, dob, major);
		sinhViens.add(newStudent);
		return "redirect:/list";
	}
}
