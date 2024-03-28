package com.sky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.entity.General;
import com.sky.repository.GeneralMapper;

@SpringBootTest
class Sp03288ApplicationTests {
	
	@Autowired
	GeneralMapper generalMapper;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	void counting() {
		System.out.println(generalMapper.count());
	}
	@Test
	void sell() {
		generalMapper.delete(1L);
	}
	
	@Test
	void get() {
		General gn = new General("1234","ikd01@daum.net","최댠");
		System.out.println(gn);
		
	}

}
