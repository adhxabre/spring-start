package com.waystalk.demo.service;

import com.waystalk.demo.dao.TodoDao;
import com.waystalk.demo.model.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoDao todoDao;

    @Autowired
    public TodoService(@Qualifier("dummyDao") TodoDao todoDao) {
        this.todoDao = todoDao;
    }
    
    public int addTodo(Todo todo) {
        return todoDao.addTodo(todo);
    }

}
