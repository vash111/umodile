package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		return "index";
	}
	
	@GetMapping("/logout")
	public String adminLogout(HttpSession session, HttpServletRequest request) {


		session.invalidate(); // 세션 무효화
		
		return "redirect:/";
	}
	

}