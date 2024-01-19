package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Login")
public class MyLoginController {
	@GetMapping("/")
	public String ShowLogin() {
		return "Login";	
	}
}
