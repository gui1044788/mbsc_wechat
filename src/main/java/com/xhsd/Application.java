package com.xhsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 *
 * @author Guij
 */
@SpringBootApplication(exclude= {SecurityAutoConfiguration.class })
public class Application {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
