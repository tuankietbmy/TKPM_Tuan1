package com.example.api_week01.controllers;

import com.example.api_week01.models.User;
import com.example.api_week01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    List<User> getListUser(){
        return  userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    User getUserById(@PathVariable long id){
        return userRepository.findById(id).get();
    }
}
