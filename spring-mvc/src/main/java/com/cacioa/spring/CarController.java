package com.cacioa.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/car")

public class CarController {

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
