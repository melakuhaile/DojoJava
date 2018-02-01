package com.codingdojo.secondweek.dojosandninjas.controllers;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.secondweek.dojosandninjas.models.Dojo;
import com.codingdojo.secondweek.dojosandninjas.models.Ninja;
import com.codingdojo.secondweek.dojosandninjas.services.NinjaDojoService;

@Controller
public class HomeController {
	private NinjaDojoService ninjaDojoService;
	public HomeController(NinjaDojoService ninjaDojoService) {
		this.ninjaDojoService = ninjaDojoService;
	}
	
	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("dojos", ninjaDojoService.allDojos());
		return "index";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo";
		}
		ninjaDojoService.addDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", ninjaDojoService.allDojos());
		return "newNinja";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "newNinja";
		}
		ninjaDojoService.addNinja(ninja);
		return "redirect:/";
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = ninjaDojoService.getDojo(id);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", ninjaDojoService.dojoNinjas(dojo));
		return "showDojo";
	}
}