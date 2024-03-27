package com.sky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.repository.ProductMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Sb0327ApplicationTests {
	
	@Autowired
	ProductMapper productMapper;

	@Test
	void contextLoads() {
		log.debug("products 레코드 수 {}", productMapper.count());
	}

}
