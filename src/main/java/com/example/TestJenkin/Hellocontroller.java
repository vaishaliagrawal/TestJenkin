package com.example.TestJenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Hellocontroller {
	
	@GetMapping
	public String hello()
	{
		return "Hello Vaishali Kartik";
	}
 
}
