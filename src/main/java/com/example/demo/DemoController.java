package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Endpoint 1";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running - Endpoint 2";
    }
    
    @GetMapping("/nikhil")
    public String nikhil() {
        return "Application is running - Endpoint 3";
    }
}
