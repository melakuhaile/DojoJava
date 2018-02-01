package com.codingdojo.secondweek.portfolio.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/melaku")
	public String me() {
		return "aboutme.html";
	}

	@RequestMapping("/project")
	public String projects() {
		return "projects.html";
	}

}
