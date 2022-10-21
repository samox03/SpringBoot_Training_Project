package com.example.spring_training.entity;

import java.time.LocalDate;

//what happens here: created different constructors, getters/setters, toString()

public class User {
    private Long id;
    private String name;
    private String email;
    private LocalDate date;
    private Integer age;

    public User(Long id) {
        this.id = id;
    }

    public User(Long id,
                String name,
                String email,
                LocalDate date,
                Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }

    public User(String name,
                String email,
                Integer age,
                LocalDate date) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
