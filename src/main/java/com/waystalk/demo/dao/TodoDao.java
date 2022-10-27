package com.waystalk.demo.dao;

import com.waystalk.demo.model.Todo;

import java.util.UUID;

public interface TodoDao {
    
    int insertTodo(UUID id, Todo todo);

    default int addTodo(Todo todo) {
        UUID id = UUID.randomUUID();
        return insertTodo(id, todo);
    }
}
