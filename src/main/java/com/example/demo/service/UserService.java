package com.example.demo.service;

import com.example.demo.client.MyWebClient;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    MyWebClient myWebClient;

    public List<User> getUsers() {
        var users = myWebClient.getAllUsers();

        return Arrays.asList(users).stream().toList();
    }

    public User createUser(User user) {
        return myWebClient.createUser(user);
    }

}
