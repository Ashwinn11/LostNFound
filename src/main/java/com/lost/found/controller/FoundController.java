package com.lost.found.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/found")
public class FoundController {
    @GetMapping("/test")
    public String testMethod(){
        return "Welcome to the page";
    }
}
