package com.xhsd.baseutils.configuration;


import com.xhsd.baseutils.filter.AccessLogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 接口出入参打印过滤器注册
 *
 */
//@Configuration
public class AccessLogFilterConfiguration {


    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new AccessLogFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
