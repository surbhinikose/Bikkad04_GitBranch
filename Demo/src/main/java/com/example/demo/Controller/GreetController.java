package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GreetController

{
	 @GetMapping("/greet")
		public String welcome()
		{
			String mgs = "Good Morning";
			return mgs;
			
		}
}
