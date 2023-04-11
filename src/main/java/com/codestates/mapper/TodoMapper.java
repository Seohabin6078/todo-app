package com.codestates.mapper;

import com.codestates.dto.TodoDto;
import com.codestates.entity.Todo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoMapper {

    public Todo todoPostDtoToTodo(TodoDto.Post todoPostDto) {
        Todo todo = new Todo();
        todo.setTitle(todoPostDto.getTitle());
        todo.setTodoOrder(todoPostDto.getTodoOrder());
        todo.setCompleted(todoPostDto.isCompleted());

        return todo;
    }

    public Todo todoPatchDtoToTodo(TodoDto.Patch todoPatchDto) {
        Todo todo = new Todo();
        todo.setTodoId(todoPatchDto.getTodoId());

        if (todoPatchDto.getTitle() != null) {
            todo.setTitle(todoPatchDto.getTitle());
        }

        if (todoPatchDto.getTodoOrder() != null) {
            todo.setTodoOrder(todoPatchDto.getTodoOrder());
        }

        if (todoPatchDto.getCompleted() != null) {
            todo.setCompleted(todoPatchDto.getCompleted());
        }

        return todo;
    }

    public TodoDto.Response todoToTodoResponseDto(Todo todo) {
        TodoDto.Response response = new TodoDto.Response();
        response.setId(todo.getTodoId());
        response.setTitle(todo.getTitle());
        response.setTodoOrder(todo.getTodoOrder());
        response.setCompleted(todo.isCompleted());
        return response;
    }

    public List<TodoDto.Response> todosToTodoResponseDtos(List<Todo> todos) {
        // 여기부터 할까 내일은??
        // todo controller부터 나머지들 완성해나가기!!!
    }
}
