package com.sky.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sky.dto.Member;
import com.sky.dto.MemberDto;
import com.sky.service.MemberService;

@Controller
public class MyController {
	
//	@Autowired
//	private MemberDao memberDao;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String root(Model model) {
//		System.out.println(memberDao.count());
//		model.addAttribute("str", "DB에서 받은 값");
//		model.addAttribute("count", memberDao.count());
		model.addAttribute("list", memberService.listAll());
		return "root";
	}
	
	@PostMapping("/input")
	public String input(Model model, Member member) {
		System.out.println(member);
		memberService.insert(member);
		model.addAttribute("list", memberService.listAll());
		return "root";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(int id, Model model) {
		System.out.println("id="+id);
		model.addAttribute("member", memberService.findById(id));
		model.addAttribute("list", memberService.listAll());
		return "updateForm";
	}
	
	@PostMapping("/update")
	public String update(Model model, MemberDto memberDto) {
		System.out.println(memberDto);
		Member member = new Member();
		BeanUtils.copyProperties(memberDto, member);
//		ModelMapper modelMapper = new ModelMapper();
//		Member member = modelMapper.map(memberDto, Member.class);
		System.out.println(member);
		memberService.update(member);
		model.addAttribute("list", memberService.listAll());
		return "root";
	}
	
	
//	@GetMapping("/todo")
//	public String todo() {
//		return "todoList";
//	}
	
//	@PostMapping("/list")
//	public String list(Model model) {
//		model.addAttribute("list", memberService.listAll());
//		return "list";
//	}
//	
//	@GetMapping("/data")
//	@ResponseBody
//	public Member data(Model model, int id) {
//		return memberService.findById(id);
//	}
//	
//	@GetMapping("/root2") 
//	public String root2(Model model) {
//		model.addAttribute("list", memberService.listAll());
//		return "root2";
//	}

}



