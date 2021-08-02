package com.cacioa.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
		public String processForm() {
			return "helloworld";
		}
	
	// controller to read from data and add to model
	
	@RequestMapping("/processFormAddToModel")
	public String greetingUpperCase(HttpServletRequest request, Model model) {
		
		
		// read request parameter from html
		String theName = request.getParameter("studentName");
		
		// convert to uppercase and add greeting
		String message = "Hello "+ theName.toUpperCase();

		// add message to model
		model.addAttribute("message",message);
		return "helloworld";
	}
	
	@RequestMapping("/processBindParam")
	public String greetingUpperCase(@RequestParam("studentName") String studentName, Model model) {
		
		
		//bind request param 
		// convert to uppercase and add greeting 
		String message = "Hello "+ studentName+". This is using Request Param";

		// add message to model
		model.addAttribute("message",message);
		return "helloworld";
	}
	
}
