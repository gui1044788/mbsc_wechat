package com.xhsd.baseutils.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource")
    public DataSource dataSource34() {
        return new DruidDataSource();
    }


}


