package com.bmi.calculator.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bmi.calculator.BMI;

@Controller
public class BMIController {
	
	@GetMapping("/index")
	public String ViewForm(Model model) {
		BMI bmi=new BMI();
		model.addAttribute("bmi",bmi);
		return "index";
	}
	@PostMapping("/Calculator")
	public String BMICalculator(@ModelAttribute("bmi") BMI bmi, Map<String, Object> model) {
	    double bmiVal = bmi.getBMIIndex();
//	    model.put("bmi", bmi);
	    String message;
	    if (bmiVal < 18.5) {
	        message = "Underweight";
	    } else if (bmiVal >= 18.5 && bmiVal <= 24.9) {
	        message = "Healthy Weight";
	    } else if (bmiVal >= 25 && bmiVal <= 29.9) {
	        message = "Overweight";
	    } else {
	        message = "Obese";
	    }
	    
	    model.put("bmiMessage", message);
	   
	    return "bmiValue";
	}

}
