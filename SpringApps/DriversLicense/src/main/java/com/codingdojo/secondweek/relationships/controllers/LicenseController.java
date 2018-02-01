package com.codingdojo.secondweek.relationships.controllers;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.secondweek.relationships.models.License;
import com.codingdojo.secondweek.relationships.services.LicenseService;
import com.codingdojo.secondweek.relationships.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class LicenseController {
	
	private LicenseService _ls;
	private PersonService _ps;
	
	public LicenseController(LicenseService _ls, PersonService _ps) {
		this._ls = _ls;
		this._ps = _ps;
	}

	@RequestMapping("/new")
	public String showLicenseForm(Model model, @ModelAttribute("license") License license) {
		model.addAttribute("persons", _ps.getAllPersons());
		return "addLicense";
	}
	
	@PostMapping("/new")
	public String createLicense(Model model, @ModelAttribute("license") License license, BindingResult result) {
		DecimalFormat decimalFormat = new DecimalFormat("000000");
		license.setNumber(decimalFormat.format(License.getCounter()));
		License.setCounter(License.getCounter() + 1);
		_ls.createLicense(license);
		return "redirect:/";
	}
	
	
	@RequestMapping("/deleteAll/noSeriously")
	public String theNuclearOption() {
		_ls.theNuclearOption();
		return "redirect:/";
	}
}
