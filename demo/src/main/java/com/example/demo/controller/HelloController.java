package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController  {
//    @RequestMapping(value = "/", method = RequestMethod.GET) //method1
    @GetMapping("/")
    public String HelloWorld(){
        return "Welcome to daily code buffer!!";
    }

}