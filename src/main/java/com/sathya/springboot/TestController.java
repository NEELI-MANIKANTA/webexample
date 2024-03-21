package com.sathya.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String display()
	{
		return "data.html";
	}
	@RequestMapping("/student")
	public String student()
	{
		return "student.html";
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome.html";
	}
}
