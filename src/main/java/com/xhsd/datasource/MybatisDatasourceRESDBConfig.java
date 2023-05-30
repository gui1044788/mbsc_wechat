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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Collections;


/**
 * sqlserver
 * ip:172.16.0.RESDB:1433
 * CHMC
 * @author guijun
 *
 */
@Configuration
@MapperScan(basePackages = {"com.xhsd.mapper.datasourceresdb"}, sqlSessionFactoryRef = "sqlSessionFactoryDsRESDB")
public class MybatisDatasourceRESDBConfig {

    @Autowired
    @Qualifier("datasourceRESDB")
    private DataSource datasourceRESDB;

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptorSqlServerRe() {
        PaginationInnerInterceptor paginationInterceptor = new PaginationInnerInterceptor();
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        paginationInterceptor.setMaxLimit(-1L);
        paginationInterceptor.setDbType(DbType.SQL_SERVER);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setOptimizeJoin(true);
        return paginationInterceptor;
    }
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptorSqlServerRe(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.setInterceptors(Collections.singletonList(paginationInnerInterceptorSqlServerRe()));
        return mybatisPlusInterceptor;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryDsRESDB() throws Exception {
        MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
        factoryBean.setDataSource(datasourceRESDB);
        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/datasourceresdb/*.xml")
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
        factoryBean.setPlugins(mybatisPlusInterceptorSqlServerRe());

        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateDsRESDB() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryDsRESDB());
        return template;
    }

    @Bean
    public DataSourceTransactionManager transactionManagerRESDB() {
        return new DataSourceTransactionManager(datasourceRESDB);
    }
}
