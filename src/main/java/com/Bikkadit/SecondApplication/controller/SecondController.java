package com.Bikkadit.SecondApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class SecondController {

	@GetMapping("/")
	public String getMsg1() {
		String  msg="Good Night";
		return msg;
	}
	
	@GetMapping("/")
	public String getMsg2() {
		String  msg="Good Night";
		return msg;
	}
	
}
