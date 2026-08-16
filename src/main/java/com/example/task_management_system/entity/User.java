package com.example.task_management_system.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
    @Table(name= "users")

    public class User {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first name", nullable = false, length = 100)
        private String firstName;

    @Column(name = "last name", nullable = false, length = 100)
        private String lastName;

    @Column(nullable = false, unique = true, length = 225)
        private String email;

    @Column(nullable = false, length = 225)
        private String password;

    @Column(name = "created at", nullable = false)
        private LocalDateTime createAt;

    @Column(name ="updated at", nullable = false)
    private LocalDateTime updatedAt;


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
