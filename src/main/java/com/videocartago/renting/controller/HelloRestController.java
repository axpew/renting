package com.videocartago.renting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/home")
    public String home() {
        return "Hello World!";
    }
}
