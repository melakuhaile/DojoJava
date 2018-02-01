package com.codingdojo.secondweek.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/your_server")

 class HumanController {
	@RequestMapping("")
	public String index(@RequestParam(value="name", defaultValue = "Human")
	String name, @RequestParam(value = "lname", defaultValue="") String lname, Model model)
	{
		if(name == null) 
		{model.addAttribute("name", "Human");}
		else
		{ model.addAttribute("name", name);}
		
		if(lname == null)
		{model.addAttribute("lname", lname);}
		
		else
		{model.addAttribute("lname", "ninja");}
	
		return "index.jsp";
	}}
	

