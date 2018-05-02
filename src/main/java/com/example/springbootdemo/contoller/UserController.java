package com.example.springbootdemo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "hello")
    public String hello(){
        return  "this is the first boot";
    }
}
