package com.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description springboot 启动工程
 **/
@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(WebApplication.class);
        //关闭启动banner
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
