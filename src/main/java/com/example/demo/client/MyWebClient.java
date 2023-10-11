package com.example.demo.client;

import com.example.demo.model.User;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.ArrayList;
import java.util.List;

public class MyWebClient {

    private WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");

    public User[] getAllUsers() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class)
                .block();
    }

    public User createUser(User user) {
        return webClient.post()
                .uri("/users")
                .bodyValue(user)
                .retrieve()
                .bodyToMono(User.class)
                .block();
    }

}
