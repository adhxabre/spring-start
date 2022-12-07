package com.waystalk.demo.models.repos;

import com.waystalk.demo.models.entities.Todo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, String> {

    List<Todo> findByTitleContains(String todo);

}
