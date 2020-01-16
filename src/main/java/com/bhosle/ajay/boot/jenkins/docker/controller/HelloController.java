package com.bhosle.ajay.boot.jenkins.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello, Testing CI/CD integration with GitHub, Jenkins & Docker, troubleshooting issues and more issues";
	}
}
