package com.waystodo.todo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloWorldController {

    @GetMapping
    public String welcome() {
        return "Hello world!";
    }

}
