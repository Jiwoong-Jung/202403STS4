package com.sky.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BoardDto {  // Member 테이블을 사용함 (양해 부탁)
	
	private int id;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private String regdate;
}
