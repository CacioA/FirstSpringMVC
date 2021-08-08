package com.cacioa.spring;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/car")

public class CarController {

	
	// check for white spaces
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// add new car object to the model
		theModel.addAttribute("car",new Car());
		
		return "car-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
							@Valid @ModelAttribute("car") Car theCar,
							BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "car-form";
		}
		else {
			return "car-confirmation";
		}
	
		// this populates the car object from the car-form.jsp <form...>
		// name needs to match
		
		// log
	
	}
}
