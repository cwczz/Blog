package com.cwc.blogproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.cwc.blogproject.Mapper")
public class BolgprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(BolgprojectApplication.class, args);
    }

}
