package dpacoladev.com.github.TodoList.service;

import dpacoladev.com.github.TodoList.entity.Todo;
import dpacoladev.com.github.TodoList.repository.TodoRepository;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return findAll();
    }

    public List<Todo> findAll() {
        Sort sort = Sort
                    .by("prioridade")
                    .descending()
                    .and(
                        Sort.by("nome")
                            .ascending()
                    );
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return findAll();
    }

    public List<Todo> deleteById(Long id) {
        todoRepository.deleteById(id);
        return findAll();
    }
}
