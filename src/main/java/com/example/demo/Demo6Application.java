package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}
		
		@GetMapping(value = "/")
		public String doGetHelloWorld() {
			return "Hello World";
		}
	
		@GetMapping(value = "/demo")
		public String doGetHelloWorldDemo() {
			return "Hello World (Demo)";
		}

}
