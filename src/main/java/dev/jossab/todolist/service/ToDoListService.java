package dev.jossab.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import dev.jossab.todolist.entity.ToDoList;
import dev.jossab.todolist.repository.ToDoListRepository;

@Service
public class ToDoListService {
    @Autowired
    ToDoListRepository toDoListRepository;

    public ToDoList createToDoList(ToDoList list){
        return toDoListRepository.save(list);
    }

    public List<ToDoList> findAll(){
        return toDoListRepository.findAll();
    }

    public List<ToDoList> findBy(ToDoList list){
        return toDoListRepository.findAll(Example.of(list));
    }

    public ToDoList findById(Integer id){
        return toDoListRepository.findById(id).get();
    }

    public ToDoList update(ToDoList list){
        return toDoListRepository.save(list);
    }

    public void delete(ToDoList list){
         toDoListRepository.delete(list);
    }

    public void deleteById(Integer id){
        toDoListRepository.deleteById(id);
    }
}
