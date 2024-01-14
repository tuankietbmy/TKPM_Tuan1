package com.example.api_week01_may2.controllers;

import com.example.api_week01_may2.models.User;
import com.example.api_week01_may2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControler {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }
}
