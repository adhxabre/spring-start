package com.example.waystodo.controllers;

import com.example.waystodo.models.entities.Todo;
import com.example.waystodo.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoServices todoService;

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

}
