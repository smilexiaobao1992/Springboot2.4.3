package com.begin.springboot2.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xujunbao
 * @ClassName com.begin.springboot2.controller
 * @description
 * @Create Date : 2023/1/29
 */
@Api(tags = "hell测试")
@RestController
public class HelloController {
    @ApiOperation("hello测试返回")
    @GetMapping("/hello")
    public String hello(){
        return "helloworld";
    }
}
