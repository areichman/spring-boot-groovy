package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyDetails {

  @GetMapping("/companies/{id}")
	String getCompanyDetails(@PathVariable String id) {
		return "Company ID: " + id
	}

}
