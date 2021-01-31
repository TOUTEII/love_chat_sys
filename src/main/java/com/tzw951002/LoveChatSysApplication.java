package com.tzw951002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value ="com.tzw951002.mapper")
public class LoveChatSysApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LoveChatSysApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LoveChatSysApplication.class, args);
    }

}
