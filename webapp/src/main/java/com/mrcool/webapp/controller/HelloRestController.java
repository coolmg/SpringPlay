package com.mrcool.webapp.controller;

import com.mrcool.webapp.json.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/rest")
	public Greeting greet(@RequestParam(required = false, defaultValue = "World") String name) {
		return new Greeting("Hello, " + name + "!");
	}

}
