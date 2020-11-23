package com.sharding.mysql.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sharding.mysql.example.dao")
public class ShardingMysqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingMysqlExampleApplication.class, args);
    }

}
