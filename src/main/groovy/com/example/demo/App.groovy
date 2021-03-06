package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class App {

	@RequestMapping("/")
  public String root() {
    return "Greetings from Spring Boot with Groovy!"
  }

	static void main(String[] args) {
		SpringApplication.run(App, args)
	}

}
