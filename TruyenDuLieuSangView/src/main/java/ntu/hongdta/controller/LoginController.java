package ntu.hongdta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import ntu.hongdta.service.UserAccount;


@Controller
public class LoginController {
	@Autowired
	private UserAccount userAccount;
	
	@GetMapping("login")
	public ModelAndView showLoginPage() {
		return new ModelAndView("login");
	}
	
	@PostMapping("login")
	public ModelAndView login(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		ModelAndView modelAndView = new ModelAndView();
		
		if(userAccount.authenticate(id, pass)) {
			modelAndView.setViewName("home");
			modelAndView.addObject("message","Đăng nhập thành công");
		}
		else {
			modelAndView.setViewName("login");
			modelAndView.addObject("message","Tên đăng nhập hoặc tài khoản sai");
		}
		return modelAndView;
	}
}
