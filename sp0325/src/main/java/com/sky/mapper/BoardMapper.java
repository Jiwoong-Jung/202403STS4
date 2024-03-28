package com.sky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sky.dto.BoardDto;

@Mapper
public interface BoardMapper {
	List<BoardDto> selectBoardList();
	
	int selectCount();
	
	int insertBoard(BoardDto board);

//	BoardDto selectBoardDetail(int boardIdx);
//
//	void updateHitCount(int boardIdx);
//	
//	void updateBoard(BoardDto board);
//	
//	void deleteBoard(int boardIdx);
}
