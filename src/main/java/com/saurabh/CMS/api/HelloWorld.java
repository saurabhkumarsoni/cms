package com.saurabh.CMS.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "hello")
    public  String sayHello(){
        return  "hello world";
    }
}
