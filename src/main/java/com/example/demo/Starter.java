package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Starter {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello dear";
	}
}
