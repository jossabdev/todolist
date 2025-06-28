package dev.jossab.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jossab.todolist.entity.ToDoList;
import dev.jossab.todolist.service.ToDoListService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("todolist")
public class ToDoListController {

    @Autowired
    ToDoListService service;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ToDoList>> findAll(){
        return new ResponseEntity(service.findAll(), HttpStatus.OK);    
    }

    @PostMapping(path = "new", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<ToDoList> create(@RequestBody ToDoList todolist){
        return new ResponseEntity(service.createToDoList(todolist), HttpStatus.CREATED);    
    }
}
