package com.myba.mybatest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = MyBaTestApplication.class)
@SpringBootApplication
public class MyBaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBaTestApplication.class, args);
    }

}
