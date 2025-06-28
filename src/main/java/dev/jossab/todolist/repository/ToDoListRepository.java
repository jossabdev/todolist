package dev.jossab.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.jossab.todolist.entity.ToDoList;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, Integer> {
    
}
