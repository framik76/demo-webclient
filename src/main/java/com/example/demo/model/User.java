package com.example.demo.model;

import lombok.Data;

@Data
public class User {
    Number id;
    String name;
    String username;
    String email;

    @Override
    public String toString() {
        return "SingleUser{" +
                "userName='" + username + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
