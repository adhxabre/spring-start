package com.waystodo.todo.services;

import com.waystodo.todo.models.entities.Todo;
import com.waystodo.todo.models.repositories.TodoRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    public Todo save(Todo todo) {
        return todoRepo.save(todo);
    }

    public Iterable<Todo> findAll() {
        return todoRepo.findAll();
    }

    public Todo findOne(String id) {
        Optional<Todo> todo = todoRepo.findById(id);
        if (todo.isEmpty()) {
            return null;
        } else {
            return todo.get();
        }
    }

    public void removeOne(String id) {
        todoRepo.deleteById(id);
    }

    public List<Todo> findByTitle(String title) {
        return todoRepo.findByTitleContains(title);
    }

}
