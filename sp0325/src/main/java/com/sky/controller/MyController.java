package com.sky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sky.mapper.BoardMapper;

@Controller
public class MyController {
	@Autowired
	BoardMapper boardMapper;
	
	@GetMapping("/")
	public String root(Model model) {
		model.addAttribute("cnt", boardMapper.selectCount());
		return "root";
	}

}
