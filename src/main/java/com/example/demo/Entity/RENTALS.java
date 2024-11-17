package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Optional;

@Entity
public class RENTALS {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Float surface;
    private Float price;
    private String picture;
    private String description;
    private Date created_at;
    private Date updated_at;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = true) // Liaison avec USERS
    private User owner;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSurface() {
        return surface;
    }

    public void setSurface(Float surface) {
        this.surface = surface;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price){
        this.price = price;
    }

    public void setCreatedAt() {
        this.created_at = new Date();
    }

    public void setUpdatedAt() {
        this.updated_at = new Date();
    }

    public void setOwner(User owner){
        this.owner = owner;
    }
}
