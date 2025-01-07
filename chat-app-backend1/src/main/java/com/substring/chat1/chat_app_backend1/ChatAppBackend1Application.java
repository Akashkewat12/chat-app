package com.substring.chat1.chat_app_backend1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatAppBackend1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChatAppBackend1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello");
	}
}
