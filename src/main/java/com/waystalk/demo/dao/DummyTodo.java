package com.waystalk.demo.dao;

import com.waystalk.demo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("dummyDao")
public class DummyTodo implements TodoDao {

    private static List<Todo> DB = new ArrayList<>();

    @Override
    public int insertTodo(UUID id, Todo todo) {
        DB.add(new Todo(id, todo.getTitle()));
        return 1;
    }

}
