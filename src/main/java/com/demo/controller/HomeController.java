package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Spring MVC controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Springboot demo!";
    }
}
