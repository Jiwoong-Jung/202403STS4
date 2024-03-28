package com.sky.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {
	@Select("select count(*) from member")
	int count();
}
