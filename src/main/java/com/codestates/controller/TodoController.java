package com.codestates.controller;

import com.codestates.dto.TodoDto;
import com.codestates.entity.Todo;
import com.codestates.mapper.TodoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
@Validated
public class TodoController {

    private final TodoMapper todoMapper;

    public TodoController(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public ResponseEntity postTodo(@RequestBody @Valid TodoDto.Post requestBody) {
        Todo todo = todoMapper.todoPostDtoToTodo(requestBody);
        // 서비스 계층처리

        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity getAllTodos() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity getTodo() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity patchTodo() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity deleteAllTodos() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity deleteTodo() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
