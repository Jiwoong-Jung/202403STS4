package com.sky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sky.model.Product;
import com.sky.repository.ProductMapper;
import com.sky.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Sb0327ApplicationTests {
	
	@Autowired
	ProductMapper productMapper;
	
	@Autowired
    private ProductService productService;

	@Test
	void contextLoads() {
		log.debug("products 레코드 수 {}", productMapper.count());
	}
	
	@Test
    public void getProductById() {
        Product product = productService.getProductById(1L);
        log.info("product : {}", product);
    }

}
