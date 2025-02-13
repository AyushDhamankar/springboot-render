package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @GetMapping("/get")
    public String getMethodName() {
        return"Hello Bhailog";
    }
    
    @GetMapping("/")
    public String getNormalMethodName() {
        return "Welcome Bhailog";
    }
}
