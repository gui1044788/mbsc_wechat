package com.xhsd.config;//
//package com.xhsd.config;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import java.util.Collections;
//
///**
// * mybatis 分页查询方法
// */
//@EnableTransactionManagement
//@Configuration
//@MapperScan("com.xhsd.mapper.datasource75")
//public class MybatisPlusMysqlConfig {
//    /**
//     * 分页插件 3.5.X
//     * @author zhengkai.blog.csdn.net
//     */
//    @Bean
//    public PaginationInnerInterceptor paginationInnerInterceptorMysql() {
//        PaginationInnerInterceptor paginationInterceptor = new PaginationInnerInterceptor();
//        // 设置最大单页限制数量，默认 500 条，-1 不受限制
//        paginationInterceptor.setMaxLimit(-1L);
//        paginationInterceptor.setDbType(DbType.MYSQL);
//        // 开启 count 的 join 优化,只针对部分 left join
//        paginationInterceptor.setOptimizeJoin(true);
//        return paginationInterceptor;
//    }
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptorMysql(){
//        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
//        mybatisPlusInterceptor.setInterceptors(Collections.singletonList(paginationInnerInterceptorMysql()));
//        return mybatisPlusInterceptor;
//    }
//}
