package dpacoladev.com.github.TodoList.repository;

import dpacoladev.com.github.TodoList.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {}
