package com.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description helloworld 创建
 */
@RestController
public class HelloWorld {

    @RequestMapping("helloworld")
    public String helloworld(){
        return "hello world12";
    }
}
