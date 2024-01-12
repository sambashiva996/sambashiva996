package com.mightyjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap/client1")
public class HelloResource {

 

    @GetMapping
    public String hello() {
        return "Hello World!welcome";
    }
}
