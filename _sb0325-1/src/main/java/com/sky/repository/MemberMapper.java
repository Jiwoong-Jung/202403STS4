package com.sky.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	int selectCount();
}
