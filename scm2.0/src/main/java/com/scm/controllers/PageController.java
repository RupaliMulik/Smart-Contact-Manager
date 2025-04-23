package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	@RequestMapping("/home")
	public String home(Model model) {
		//sending data to view
		model.addAttribute("name", "rupali");
		model.addAttribute("project","Contact Manager");
		System.out.println("home page handler");
		return "home";  //returning view name so spring will look for home.html inside /templates folder
	}
	
	//about Route

	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("isLogin",true);
		System.out.println("About Page Loading");
		return "about";
	}
	
	//services page
	@RequestMapping("/services")
	public String services() {
		System.out.println("Service Page Loading");
		return "services";
	}
	
	//contact page
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("Contact Page Loading");
		return "contact";
	}
	
	//login 
	@RequestMapping("/login")
	public String login() {
		System.out.println("Login page loading");
		return "login";
	}
	
	//signup
	@RequestMapping("/register")
	public String register() {
		System.out.println("Signup page loading");
		return "register";
	}

}


