package com.sky;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.mapper.EmpMapper;

@SpringBootTest
class Sb03221ApplicationTests {
	
	@Autowired
	EmpMapper boardMapper;

	@Test
	void contextLoads() {
		System.out.println(boardMapper.selectCount());
	}
	
	@Test
	@DisplayName("한글로")
	void empListTest() {
		
	}

}
