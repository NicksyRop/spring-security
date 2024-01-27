package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/welcome")
    public String greetings(){
        return "Hello from products";
    }

    @GetMapping("/auth")
    public String auth(){
        return "Authenticate to products";
    }
}
