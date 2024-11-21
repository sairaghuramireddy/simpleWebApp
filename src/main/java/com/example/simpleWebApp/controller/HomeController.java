package com.example.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/greet")
    public String greet(){
        return "Welcome to Spring!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Find info here...";
    }
}
