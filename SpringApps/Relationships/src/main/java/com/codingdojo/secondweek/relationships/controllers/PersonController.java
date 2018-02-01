package com.codingdojo.secondweek.relationships.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.secondweek.relationships.models.License;
import com.codingdojo.secondweek.relationships.models.Person;
import com.codingdojo.secondweek.relationships.services.LicenseService;
import com.codingdojo.secondweek.relationships.services.PersonService;

@Controller
public class PersonController {

	private final PersonService ps;
	private final LicenseService ls;
	
	public PersonController(PersonService ps, LicenseService ls) {
		this.ps = ps;
		this.ls = ls;
	}
	
	@RequestMapping(value="/") 	
	public String home(){
		return "landingpage.jsp";
	}

	@RequestMapping(value="/persons/new")
	public String addPerson(@ModelAttribute("person") Person person) {
		return "addPerson.jsp";
	}
	
	@PostMapping(value="/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "addPerson.jsp";
		}else {
			ps.addPerson(person);
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="delete/{id}")
	public String removePerson(@PathVariable("id")Long id) {
		ps.destroyPerson(id);
		return "redirect:/";
	}
	
	@RequestMapping(value="/persons/{id}")
	public String personDetails(@PathVariable("id")Long id, Model model) {
		Person foundPerson = ps.findPerson(id);
		License foundLicense = ls.findLicense(foundPerson.getId());
		model.addAttribute("foundPerson", foundPerson);
		model.addAttribute("foundLicense", foundLicense);
		System.out.println("Person first name: " + foundPerson.getFirstName());
		System.out.println("Person license: " + foundLicense.getState());
		return "person.jsp";
	}
}
