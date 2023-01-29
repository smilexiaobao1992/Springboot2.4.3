package com.begin.springboot2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xujunbao
 * @ClassName com.begin.springboot2.controller
 * @description
 * @Create Date : 2023/1/29
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }
}
