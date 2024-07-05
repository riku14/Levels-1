package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.repository")  // 追加
public class Levels1Application {
    public static void main(String[] args) {
        SpringApplication.run(Levels1Application.class, args);
    }
}
