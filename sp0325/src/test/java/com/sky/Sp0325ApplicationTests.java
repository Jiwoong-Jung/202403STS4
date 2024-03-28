package com.sky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.dto.BoardDto;
import com.sky.mapper.BoardMapper;

@SpringBootTest
class Sp0325ApplicationTests {
	
	@Autowired
	private BoardMapper boardMapper;

	@Test
	void contextLoads() {
		System.out.println("나오나?"+boardMapper);
		System.out.println(boardMapper.selectCount());
		System.out.println(boardMapper.selectBoardList());
	}
	
	//@Test
	void insertTest() {
		BoardDto dto = BoardDto.builder().email("a0325@korea.com").name("구하나").password("7890").build();

		int id = boardMapper.insertBoard(dto);
		System.out.println("id:" + id);
		System.out.println(boardMapper.selectBoardList());
	}

}
