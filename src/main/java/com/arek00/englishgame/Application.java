package com.arek00.englishgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arek00 (arek00.com)
 */
@SpringBootApplication
@RestController
public class Application {

	public static void main(final String args[]) {
		SpringApplication.run(Application.class);
	}

	@GetMapping("/")
	private String helloWorld() {
		return "Hello World";
	}
}
