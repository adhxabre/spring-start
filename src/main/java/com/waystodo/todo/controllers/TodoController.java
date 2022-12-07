package com.waystodo.todo.controllers;

import com.waystodo.todo.models.entities.Todo;
import com.waystodo.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @GetMapping
    public Iterable<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping("{id}")
    public Todo findOne(@PathVariable("id") String id) {
        return todoService.findOne(id);
    }

    @PatchMapping
    public Todo update(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @DeleteMapping("{id}")
    public void removeOne(@PathVariable("id") String id) {
        todoService.removeOne(id);
    }

}
