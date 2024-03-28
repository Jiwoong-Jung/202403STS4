package com.sky.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sky.entity.General;

@Mapper
public interface GeneralMapper {
	@Select("SELECT count(*) FROM general")
	int count();
	
	@Delete("delete from general where id = #{id}")
	void delete(Long id);
	
	@Insert("")
	void insert(General gn);
}
