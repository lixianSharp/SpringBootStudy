package org.lixianyuan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 18:49 2019/10/9
 * @Description:
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
