package com.codestates.mapper;

import com.codestates.dto.TodoDto;
import com.codestates.entity.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {

    public Todo todoPostDtoToTodo(TodoDto.Post todoPostDto) {
        Todo todo = new Todo();
        todo.setTitle(todoPostDto.getTitle());
        todo.setTodoOrder(todoPostDto.getTodoOrder());
        todo.setCompleted(todoPostDto.isCompleted());

        return todo;
    }
}
