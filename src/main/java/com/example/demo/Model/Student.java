package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    String marks;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMarks() {
        return marks;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
