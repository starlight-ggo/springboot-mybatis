package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.atguigu.dao")
@SpringBootApplication
@EnableTransactionManagement
public class MyApplication {

    public static void main(String[] args) {
        System.out.println(111);
        SpringApplication.run(MyApplication.class,args);
    }
}
