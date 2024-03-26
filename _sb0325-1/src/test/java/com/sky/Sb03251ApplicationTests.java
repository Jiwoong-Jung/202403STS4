package com.sky;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.repository.MemberMapper;
import com.sky.spring.Member;

@SpringBootTest
class Sb03251ApplicationTests {
	
	@Autowired
	MemberMapper memberMapper;

	@Test
	void contextLoads() {
		System.out.println(memberMapper.selectCount());
	}
	
	@Test
	@DisplayName("Member 건수")
	void displayCount() {
		System.out.println(memberMapper.count());
	}
	
	@Test
	@DisplayName("Member 이메일 검색")
	void selectByEmail() {
		System.out.println(memberMapper.selectByEmail("kim2@korea.com"));
	}
	
	@Test
	@DisplayName("Member 전체 검색")
	void selectAll() {
		for (Member member : memberMapper.selectAll()) {
			System.out.println(member);
		}
	}

}
