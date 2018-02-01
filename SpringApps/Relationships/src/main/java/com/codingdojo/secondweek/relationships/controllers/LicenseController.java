package com.codingdojo.secondweek.relationships.controllers;

import java.text.DecimalFormat;

import java.text.DecimalFormat;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.secondweek.relationships.models.Person;
import com.codingdojo.secondweek.relationships.services.PersonService;

import com.codingdojo.secondweek.relationships.models.License;
import com.codingdojo.secondweek.relationships.services.LicenseService;


@Controller
public class LicenseController {
	
	private final LicenseService ls;
	private final PersonService ps;
	
	
	
	public LicenseController(LicenseService ls, PersonService ps) {
		this.ls = ls;
		this.ps = ps;
	}
	
	public String licenseNumber() {
        int numPeople = ls.allLicenses().size();
        DecimalFormat df = new DecimalFormat("000000");
        String licenseNum = df.format(numPeople);
        return licenseNum;
    }
	
	@RequestMapping("/licenses/new")
	public String addLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> people = ps.findAll();
		model.addAttribute("people", people);
		return "addLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "addLicense.jsp";
		}else {
			license.setNumber(licenseNumber());
			ls.createLicense(license);
			return "redirect:/persons/" + license.getPerson().getId();
		}
		
	}
	
	@RequestMapping("/licenses/{id}")
	public String findLicense(@PathVariable("id") Long id, Model model) {
		License foundLicense = ls.getLicense(id);
		System.out.println("License: " + foundLicense);
		model.addAttribute("foundLicense", foundLicense);
		return "person.jsp";
	}
	
	@RequestMapping("/licenses")
	public void findAllLicenses() {
		List<License> licenses = ls.allLicenses();
		System.out.println("License List Size: " + licenses.size());
	}
}