package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 22:25 2019/9/17
 * @Description:
 */
@RestController
public class SayController {

    @Value("${person.last-name}") //从配置文件中读取值
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello " + name;
    }
}
