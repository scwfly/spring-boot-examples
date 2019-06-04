package com.springboot.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @description: 配置监控拦截器
 **/

@WebFilter(
        filterName = "druidWebStatFilter",
        urlPatterns = "/*",
        // 忽略资源
        initParams ={ @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")}
)
public class DruidStatFilter extends WebStatFilter {
}
