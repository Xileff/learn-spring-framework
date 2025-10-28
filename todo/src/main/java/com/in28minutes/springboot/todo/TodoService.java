package com.in28minutes.springboot.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "Learn Spring Boot", LocalDate.of(2025, 11, 1), "test",false));
        todos.add(new Todo(++todosCount, "Learn React", LocalDate.of(2025, 11, 2), "test",false));
    }

    public List<Todo> findByUsername(String username) {
        return todos.stream().filter(todo -> todo.getUsername().equalsIgnoreCase(username)).toList();
    }

    public void addTodo(String description, LocalDate targetDate, String username, boolean done) {
        final Todo todo = new Todo(++todosCount, description, targetDate, username, done);
        todos.add(todo);
    }

    public void deleteTodoById(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo findById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
    }

    public void updateTodo(@Valid Todo todo) {
        deleteTodoById(todo.getId());
        todos.add(todo);
    }
}
