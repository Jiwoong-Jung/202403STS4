package com.sky.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sky.dto.Dept;

@Controller
public class MyController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/")
	public String root(Model model) {
		List<Dept> list = new ArrayList<>();
		SqlRowSet rs = jdbcTemplate.queryForRowSet("select * from dept");
		while(rs.next()) {
			Dept dept = Dept.builder().deptno(rs.getInt("deptno"))
					.dname(rs.getString("dname"))
					.loc(rs.getString("loc")).build();
			list.add(dept);
		}
		model.addAttribute("list", list);
		return "root";
	}
}
