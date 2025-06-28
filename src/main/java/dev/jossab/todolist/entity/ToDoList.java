package dev.jossab.todolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "todo_list")
@Data
public class ToDoList {
    @Id       
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id")
    private Integer id;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "content", length = 4000)
    private String content;
}
