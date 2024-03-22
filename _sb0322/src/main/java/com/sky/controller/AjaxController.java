package com.sky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sky.service.MemberService;

@Controller
public class AjaxController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/ajax1")
	public String ajax1() {
		return "ajax1";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", memberService.listAll());
		return "list";
	}

}
