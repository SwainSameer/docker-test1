package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class DemoController {
	
	@GetMapping("/welcome")
	 public String getMsg() {
		 return "wel-come to Sameer...House......!!";
	 }

}
