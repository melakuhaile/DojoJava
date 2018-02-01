package com.codingdojo.secondweek.dojosurvey;


import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class SurveyController {
	@RequestMapping("/home")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(path="", method=RequestMethod.POST)
	public String submit(HttpSession session, @RequestParam(value="name") 
	String name, @RequestParam(value="location") String location, @RequestParam(value="langauge")
	String language, @RequestParam(value="comment", required=false) String comment) {
		
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
}

