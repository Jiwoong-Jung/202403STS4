package com.sky;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.dto.BoardDto;
import com.sky.mapper.BoardMapper;

@SpringBootTest
class Sb0325ApplicationTests {
	
	@Autowired
	BoardMapper boardMapper;

	@Test
	void contextLoads() {
	}
	
	@Test
	@DisplayName("member 테이블의 개수")
	void memberCount() {
		System.out.println(boardMapper.selectCount());
	}
	
	@Test
	@DisplayName("member 테이블")
	void memberSelectAll() {
		for (BoardDto dto : boardMapper.selectBoardList()) {
			System.out.println(dto);
		}
	}

}
