package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String Hello(){
		String a= "a --merge v0.10 -reking github v0.12";
		return "index";
	}
}
