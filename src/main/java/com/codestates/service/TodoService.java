package com.codestates.service;

import com.codestates.entity.Todo;
import com.codestates.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> findAllTodos() {
        return todoRepository.findAll();
    }

    public Todo findTodo(long todoId) {
        Optional<Todo> optionalTodo = todoRepository.findById(todoId);
        Todo findTodo = optionalTodo.orElseThrow(() -> new RuntimeException());
        return findTodo;
    }

    public Todo updateTodo(Todo todo) {
        Todo findTodo = findTodo(todo.getTodoId());

        // todo의 기본타입들은 patchDto와 매칭이 되었는지 안되었는지를 어떻게
        // 구분할 것인가??
        Optional.ofNullable(todo.getTitle())
    }

    public void deleteAllTodos() {

    }

    public void deleteTodo() {

    }
}
