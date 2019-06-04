package com.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 配置web相关
 **/
@Configuration
public class ResourceWebMvcConfigurer implements WebMvcConfigurer {

    /**
     * @Description 自定义静态资源
     * 当不存在@EnableWebMVC时，
     * SpringBoot 的 @EnableAutoConfiguration 会启用自动配置类 WebMvcAutoConfiguration，该类配置了一些默认的静态资源映射
     * 静态资源访问优先级 META/resources > resources > static > public
     *---------------------------------------------------------
     * 当存在 @EnableWebMVC 时
     * 如果使用了 @EnableWebMvc，则自动配置类 WebMvcAutoConfiguration 会失效，因此默认映射路径 /static, /public, META-INF/resources, /resources 都将失效
     * 这种情况下，只能设置自定义配置
     * 无任何前缀 -> “文档根目录”（一般指代 src/main/webapp 目录）， 例如 localhost:8080/index.html 定位至 src/main/webapp/static/index.html
     * 存在前缀 classpath -> 类路径（一般指代 src/main/resources 目录）
     * 存在前缀 file:// -> 文件系统路径(“绝对路径”)
     **/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:img/")   //映射resources下img文件夹，可以指定多个
                .addResourceLocations("file:C:\\Users\\neusoft\\Desktop\\"); //映射本地文件
    }
}
