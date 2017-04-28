package com.liwei.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwei on 17/4/29.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello1")
    public String hello1(){
        return "hello1";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return "hello3";
    }
}
