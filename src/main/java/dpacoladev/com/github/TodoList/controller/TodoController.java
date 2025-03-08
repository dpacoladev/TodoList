package dpacoladev.com.github.TodoList.controller;

import dpacoladev.com.github.TodoList.entity.Todo;
import dpacoladev.com.github.TodoList.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Todo> findById(@PathVariable("id") Long id) {
        return todoService.findById(id);
    }

    @PutMapping
    public List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    public List<Todo> deleteById(@PathVariable("id") Long id) {
        return todoService.deleteById(id);
    }
}