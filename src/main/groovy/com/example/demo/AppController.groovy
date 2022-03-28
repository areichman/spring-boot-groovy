package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController {

	@GetMapping("/")
	String index() {
		return "Greetings from Spring Boot with Groovy!"
	}

}
