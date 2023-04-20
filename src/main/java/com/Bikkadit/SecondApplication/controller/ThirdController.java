package com.Bikkadit.SecondApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThirdController {

	@GetMapping("/")
	public String getMsg3() {
		String  msg="Good Night";
		return msg;
	}
}
