package com.xhsd.configuration;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *  Swagger配置类
 *
 *  @author guijun
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        // 选择swagger2版本
        return new Docket(DocumentationType.SWAGGER_2)
                //定义api文档汇总信息
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                // 指定生成api文档的包
                .basePackage("com.xhsd.controller"))
                // 指定所有路径
                .paths(PathSelectors.any())
                .build()
                ;
    }

    /**
     * 构建文档api信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("医疗移动服务-微信端应用接口文档")
                .contact(new Contact("guij", "url", "1044788@qq.com"))
                .description("医疗移动服务-微信端应用接口文档")
                .version("1.0")
                .termsOfServiceUrl("http://localhost:8079/api/doc.html")
                .build();
    }

}
