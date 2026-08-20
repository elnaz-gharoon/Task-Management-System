package com.example.task_management_system.service;

import com.example.task_management_system.dto.CreateUserRequest;
import com.example.task_management_system.entity.User;
import com.example.task_management_system.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(CreateUserRequest request){
        User user1 = new User();
        user1.setFirstName(request.getFirstName());
        user1.setLastName(request.getLastName());
        user1.setEmail(request.getEmail());
        user1.setPassword(request.getPassword());
        return userRepository.save(user1);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public void deletUser(Long id){
        userRepository.deleteById(id);
    }
}
