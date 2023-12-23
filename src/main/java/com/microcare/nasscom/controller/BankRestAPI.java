package com.microcare.nasscom.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.nasscom.model.User;

@Controller
public class BankRestAPI {
	

	@GetMapping("/")
  public String firstPage(Model model) {
		System.out.println("COntroller method API");
		return "basic";
	}
	

	@GetMapping("/createuser")
  public String getUser(Model model) {
		 User user = new User();
	        model.addAttribute("user", user);
	         
	        List<String> listProfession = Arrays.asList("Microcare","Developer", "Tester", "Architect");
	        model.addAttribute("listProfession", listProfession);
		
		return "createuser";
	}
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
	    System.out.println(user);
	    return "success";
	}
}
