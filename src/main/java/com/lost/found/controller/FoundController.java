package com.lost.found.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoundController {
    @GetMapping("/test")
    public String testMethod(){
        return "Welcome to the page";
    }
}
