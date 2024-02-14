package com.springdockerkubernetesassignmentcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testingclass 
{
	@GetMapping("/hello")
    public String message() {
        return "This is an docker and kubernetes assignment";
	
}
}