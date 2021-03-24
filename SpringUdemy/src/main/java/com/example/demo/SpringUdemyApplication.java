package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringUdemyApplication {

	@Value("${application.name}")
	private String minhaConfiguração;
	
	@GetMapping("/hello")
	public String hello() {
		return minhaConfiguração;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringUdemyApplication.class, args);
	}

}
