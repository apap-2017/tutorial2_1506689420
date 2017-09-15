package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PerkalianController {

	@RequestMapping("/perkalian")
	public String perkalian(@RequestParam(value = "a", required = false, defaultValue = "0") Integer a,
	                        @RequestParam(value = "b", required = false, defaultValue = "0") Integer b, 
	                        Model model) {
		int c = a * b;
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("c", c);
		
		return "perkalian";
	}
	
}