package com.example.gomall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 　　* @author lee
 * 　　* @date 2022/4/18 17:33
 */
@Configuration
@MapperScan({"com.example.gomall.mbg.mapper", "com.example.gomall.dao"})
public class MyBatisConfig {
}
