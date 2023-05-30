package com.xhsd.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource188")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource188")
    public DataSource dataSource188() {
        return new DruidDataSource();
    }


    @Bean(name = "datasource34")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource34")
    public DataSource dataSource34() {
        return new DruidDataSource();
    }

    @Bean(name = "datasource184")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource184")
    public DataSource datasource184() {
        return new DruidDataSource();
    }

    @Bean(name = "datasource75")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource75")
    public DataSource datasource75() {
        return new DruidDataSource();
    }

    @Bean(name = "datasourceRESDB")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasourceresdb")
    public DataSource datasourceRESDB() {
        return new DruidDataSource();
    }

    @Bean(name = "datasourceEmr")
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasourceemr")
    public DataSource datasourceEmr() {
        return new DruidDataSource();
    }

}


