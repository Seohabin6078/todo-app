package com.codestates.controller;

import com.codestates.dto.TodoDto;
import com.codestates.entity.Todo;
import com.codestates.mapper.TodoMapper;
import com.codestates.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
@Validated
public class TodoController {

    private final TodoMapper todoMapper;
    private final TodoService todoService;

    public TodoController(TodoMapper todoMapper, TodoService todoService) {
        this.todoMapper = todoMapper;
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity postTodo(@RequestBody @Valid TodoDto.Post requestBody) {
        Todo todo = todoMapper.todoPostDtoToTodo(requestBody);
        TodoDto.Response response = todoMapper.todoToTodoResponseDto(todoService.createTodo(todo));

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllTodos() {
        todoService.findAllTodos();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{todo-id}")
    public ResponseEntity getTodo(@PathVariable("todo-id") long todoId) {
        Todo todo = todoService.findTodo(todoId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("{todo-id}")
    public ResponseEntity patchTodo(@RequestBody @Valid TodoDto.Patch requestBody,
                                    @PathVariable("todo-id") long todoId) {
        requestBody.setTodoId(todoId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteAllTodos() {

    }

    @DeleteMapping("{todo-id}")
    public ResponseEntity deleteTodo(@PathVariable("todo-id") long todoId) {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
