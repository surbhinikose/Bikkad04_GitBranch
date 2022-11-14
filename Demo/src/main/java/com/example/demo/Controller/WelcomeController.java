package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController
{
    @GetMapping("/welcome")
	public String welcome()
	{
		String mgs = "Welcome To BikkadIT";
		return mgs;
		
	}
	
}
