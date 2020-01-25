package com.g33kzone.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${app.greetings}")
	String greetings;

	@GetMapping(path = "/greetings", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> greetings() {

		return ResponseEntity.status(HttpStatus.OK).body(greetings);
	}
}
