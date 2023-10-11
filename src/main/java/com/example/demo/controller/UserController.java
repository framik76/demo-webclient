package com.example.demo.controller;

import com.example.demo.client.MyWebClient;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/all")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user")
    public User createUser(User user) {
        return userService.createUser(user);
    }


}
