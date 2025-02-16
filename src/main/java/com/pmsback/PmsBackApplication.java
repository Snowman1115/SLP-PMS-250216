package com.pmsback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pmsback.mapper")
public class PmsBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsBackApplication.class, args);
    }

}
