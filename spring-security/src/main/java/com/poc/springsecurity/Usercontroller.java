package com.poc.springsecurity;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Usercontroller {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model){
		
		return "Home";
	}
	
	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public String authCheck(Model model , Principal principal){
		String username=principal.getName();
		model.addAttribute("UserName", username);
		model.addAttribute("message", "welcome to spring security");
		
		
		return "welcomePage";
	}
}
