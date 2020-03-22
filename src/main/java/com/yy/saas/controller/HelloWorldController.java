package com.yy.saas.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class HelloWorldController {
    @RequestMapping("/say")
    public String say()
    {
        System.out.println("22222");
        return "hello 王晓陆!你知道正确吗";
    }
}
