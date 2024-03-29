package com.sky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sky.repository.ProductMapper;
import com.sky.service.ProductService;

@Controller
public class MyController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("userName", "홍길동");
		model.addAttribute("aaa123", "가나다");
		model.addAttribute("product", 
				    productService.getProductById(3L));
		return "main";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", productService.getAllProducts());
		return "list";
	}
	
}
