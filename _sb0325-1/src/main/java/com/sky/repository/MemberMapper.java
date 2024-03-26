package com.sky.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sky.spring.Member;

@Mapper
public interface MemberMapper {
	int selectCount();
	
	@Select("select count(*) from member")
	int count();
	
	@Select("select * from MEMBER where EMAIL = #{email}")
	Member selectByEmail(String email);
	
	@Select("select * from member")
	List<Member> selectAll();
}
