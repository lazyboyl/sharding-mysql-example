package com.sharding.mysql.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.sharding.mysql.example.dao")
public class ShardingMysqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingMysqlExampleApplication.class, args);
    }

}
