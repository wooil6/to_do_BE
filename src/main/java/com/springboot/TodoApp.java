package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoApp {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application!";
    }
}
