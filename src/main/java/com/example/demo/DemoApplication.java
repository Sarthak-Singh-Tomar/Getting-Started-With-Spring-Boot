package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController // Used to create restfull web services

// From Here only we start our application
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/") // Get Mapping used to return back something
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/json")
	public List<String> helloList() {
		return List.of("Hello", "World");
	}
}
