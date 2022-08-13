package com.example.simplewebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping ("/")
    public String helloWorld(){
        return "Hello world";
    }
}
