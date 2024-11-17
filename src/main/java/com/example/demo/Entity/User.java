package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="USERS")
public class User {
    @Id
    // I set the strategy to GenerationType.IDENTITY to use auto-increment in MySql
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String password;

    private Date created_at;

    private Date updated_at;

    @OneToMany
    private List<RENTALS> rentals;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatedAt() {
        this.created_at = new Date();
    }

    public void setUpdatedAt() {
        this.updated_at = new Date();
    }
}