package com.example.waystodo.models.repos;

import com.example.waystodo.models.entities.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, String> {

    List<Todo> findByTitleContains(String title);
    
}
