package com.xiangnong.xnservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE)
public class MasterDataSourceConfig {
    static final String PACKAGE = "com.xiangnong.xnservice.mapper";
}