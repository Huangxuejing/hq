package com.taidii.staffdevelopment.hq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hq/classSchedule")
public class TestController {
	@GetMapping("/index")
	public String test(){
		return "hq/index";
	}
	
	
	@GetMapping("/home")
	public String test1(){
		return "hq/home";
	}
}
