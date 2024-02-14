package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitdemoApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, GIT!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitdemoApplication.class, args);
    }
}