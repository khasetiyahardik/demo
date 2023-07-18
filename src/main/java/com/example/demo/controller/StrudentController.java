package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentController {

    @GetMapping("/name")
    public String getName(){
        return "hello hardik";
    }
}
