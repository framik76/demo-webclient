package com.example.demo;

import com.example.demo.client.MyWebClient;
import com.example.demo.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserController userController;

	@Autowired
	MyWebClient myWebClient;

	@Test
	void contextLoads() {
	}

}
