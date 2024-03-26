package com.sky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.repository.MemberMapper;

@SpringBootTest
class Sb03251ApplicationTests {
	
	@Autowired
	MemberMapper memberMapper;

	@Test
	void contextLoads() {
		System.out.println(memberMapper.selectCount());
	}

}
