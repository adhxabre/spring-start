package com.waystalk.demo.services;

import com.waystalk.demo.models.entities.Todo;
import com.waystalk.demo.models.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TodoServices {

    @Autowired
    private TodoRepo todoRepo;

    public Todo save(Todo todo) {
        return todoRepo.save(todo);
    }

}
