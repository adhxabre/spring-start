package com.waystodo.todo.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.waystodo.todo.models.entities.Todo;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, String> {
    List<Todo> findByTitleContains(String title);
}
