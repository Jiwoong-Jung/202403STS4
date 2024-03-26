package com.sky;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	
	//@Test
	@DisplayName("member 테이블에 입력")
	void memberInsert() {
		BoardDto dto = BoardDto.builder().email("na0326@korea.com")
				               .name("신하나").password("1234").build();
		boardMapper.insertBoard(dto);
		System.out.println("-------------------"+dto.getId());
	}
	
	//@Test
	@DisplayName("member 테이블에서 삭제")
	void memDelete() {
		int before = boardMapper.selectCount();
		boardMapper.deleteBoard(21);
		int after = boardMapper.selectCount();
		assertEquals(before-1, after);
	}
	
	@Test
	@DisplayName("member 테이블에 수정")
	void memberUpdate() {
		BoardDto dto = BoardDto.builder().email("lee0325@korea.com")
				               .name("홍길순").password("1234").id(15).build();
		boardMapper.updateBoard(dto);
	}

}
