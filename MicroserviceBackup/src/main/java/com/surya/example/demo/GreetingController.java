package com.surya.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public String greeting() {
    	return "Greetings from Spring Boot Microservice Backup for Hystrix!";
    }
}