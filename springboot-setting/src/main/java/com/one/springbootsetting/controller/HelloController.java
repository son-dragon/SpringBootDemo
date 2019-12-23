package com.one.springbootsetting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    public DataSource dataSource;

    @RequestMapping("hello")
    public String hello(){
        System.out.println(dataSource);
        return "Hello,World,驱动："+ dataSource;
    }
}
