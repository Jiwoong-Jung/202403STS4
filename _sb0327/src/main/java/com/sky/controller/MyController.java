package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	
	@GetMapping("/")
	public String root() {
		return "home";
	}
	
	@GetMapping("/items/new")
    public String createForm(Model model) {
//        model.addAttribute("form", new BookForm());
        return "createItemForm";
    }

}
