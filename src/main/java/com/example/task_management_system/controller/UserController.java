package com.example.task_management_system.controller;

import com.example.task_management_system.dto.CreateUserRequest;
import com.example.task_management_system.entity.User;
import com.example.task_management_system.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/users")
@RestController

public class UserController {
private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    //Nimm das JSON aus dem HTTP-Request und verwandle es in ein CreateUserRequest-Objekt.
    @PostMapping
    public User createUser(@RequestBody CreateUserRequest request){
        return userService.createUser(request);
    }

}
