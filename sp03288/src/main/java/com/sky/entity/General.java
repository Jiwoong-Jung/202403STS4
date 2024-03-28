package com.sky.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@Entity
@ToString
public class General {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String password;
	private String email;
	private String name;
	
	public General(String password, String email, String name) {
		super();
		this.password = password;
		this.email = email;
		this.name = name;
	}
	
	
}
