package com.manulife.gf.megatron.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/hello")
	public HttpEntity<String> hello()
	{
		return ResponseEntity.ok("hello");
	}
}