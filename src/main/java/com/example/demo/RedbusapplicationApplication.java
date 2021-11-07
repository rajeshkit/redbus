package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedbusapplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedbusapplicationApplication.class, args);
	}
	@GetMapping("/hello")
	public String welcome() {
		return "Hello!! Capgemini redbus app";
	}
	@GetMapping("/greet")
	public String greet() {
		return "Hello!! greeting to you";
	}
	@GetMapping("/product")
	public String getProduct() {
		return "product TV";
	}

}
