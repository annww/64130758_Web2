package ntu.hongdta.controller;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import ntu.hongdta.model.SinhVien;

@Controller
public class TruyenObject {
    @GetMapping("/truyenObject")
    public String danhSachSinhVien(ModelMap model) {
        ArrayList<SinhVien> danhSachSV = new ArrayList<>(Arrays.asList(
            new SinhVien("SV001", "Duong Thi Anh Hong", "Nu", 2004),
            new SinhVien("SV002", "Vi An", "Nữ", 2001),
            new SinhVien("SV003", "Anh Duong", "Nu", 1999)
        ));
        model.addAttribute("danhSachSV", danhSachSV);

        return "truyenObject";
    }
}
