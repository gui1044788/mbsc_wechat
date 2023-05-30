package com.xhsd.datasource;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Collections;


/**
 * sqlserver
 * ip:172.16.0.188:1433
 * CHMC
 * @author guijun
 *
 */
@Configuration
@MapperScan(basePackages = {"com.xhsd.mapper.datasource188"}, sqlSessionFactoryRef = "sqlSessionFactoryDs188")
public class Mybatis188Config {

    @Autowired
    @Qualifier("datasource188")
    private DataSource datasource188;

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptorSqlServer188() {
        PaginationInnerInterceptor paginationInterceptor = new PaginationInnerInterceptor();
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        paginationInterceptor.setMaxLimit(-1L);
        paginationInterceptor.setDbType(DbType.SQL_SERVER);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setOptimizeJoin(true);
        return paginationInterceptor;
    }
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptorSqlServer188(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.setInterceptors(Collections.singletonList(paginationInnerInterceptorSqlServer188()));
        return mybatisPlusInterceptor;
    }

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactoryDs188() throws Exception {
        MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
        factoryBean.setDataSource(datasource188);
        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/datasource188/*.xml")
        );
        //向Mybatis过滤器链中添加拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.SQL_SERVER));
        factoryBean.setPlugins(interceptor);

        // 导入mybatis配置
        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCacheEnabled(false);
        // 配置打印sql语句
        configuration.setLogImpl(StdOutImpl.class);
        factoryBean.setConfiguration(configuration);
        factoryBean.setPlugins(mybatisPlusInterceptorSqlServer188());

        return factoryBean.getObject();
    }

    @Bean
    @Primary
    public SqlSessionTemplate sqlSessionTemplateDs188() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryDs188());
        return template;
    }

    @Bean
    @Primary
    public DataSourceTransactionManager transactionManager188() {
        return new DataSourceTransactionManager(datasource188);
    }
}
