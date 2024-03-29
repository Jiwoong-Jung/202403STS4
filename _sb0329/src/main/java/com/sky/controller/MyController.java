package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("userName", "홍길동");
		model.addAttribute("aaa123", "가나다");
		return "main";
	}
}
