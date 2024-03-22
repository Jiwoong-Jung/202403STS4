package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AjaxController {
	
	@GetMapping("/ajax1")
	public String ajax1() {
		return "ajax1";
	}
	

}
