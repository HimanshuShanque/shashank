package com.shashank.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("home")
	public String myFunc() {
		return ("index.html");
	}

}
