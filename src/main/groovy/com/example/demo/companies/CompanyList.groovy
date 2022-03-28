package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyList {

	@GetMapping("/companies")
	String index() {
		return "Company list"
	}

}
