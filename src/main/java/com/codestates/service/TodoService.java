package com.codestates.service;

import com.codestates.entity.Todo;
import com.codestates.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    // TODO 서비스 계층 구현부터 이어서 해봅세다이이이잉
    public Todo createTodo() {
        return new Todo();
    }

    public List<Todo> findAllTodos() {
        return List.of(new Todo());
    }

    public Todo findTodo() {
        return new Todo();
    }

    public Todo updateTodo() {
        return new Todo();
    }

    public void deleteAllTodos() {

    }

    public void deleteTodo() {

    }
}
