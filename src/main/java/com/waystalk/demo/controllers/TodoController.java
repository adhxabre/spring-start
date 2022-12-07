package com.waystalk.demo.controllers;

import com.waystalk.demo.models.entities.Todo;
import com.waystalk.demo.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoServices todoServices;

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoServices.save(todo);
    }

}
