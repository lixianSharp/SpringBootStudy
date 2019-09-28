package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody //这个累的所有方法的返回数据(在类名中加这个，相当于在该类的每个方法上都加合格)（如果是对象，还能转为json数据）
@Controller*/
@RestController //（这个注解相当于@ResponseBody+@Controller 这两个注解）
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }

    //RESTAPI的方式:发一个请求，直接发到浏览器，而不是通过页面跳转的方式
}
