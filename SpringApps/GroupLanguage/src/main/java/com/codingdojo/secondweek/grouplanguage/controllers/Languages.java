package com.codingdojo.secondweek.grouplanguage.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.secondweek.grouplanguage.models.Language;
import com.codingdojo.secondweek.grouplanguage.services.LanguageService;

@Controller
public class Languages {
   private final LanguageService languageService;
   
   public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
   

	@RequestMapping("/languages")
    public String languages(Model model, @Valid @ModelAttribute("language") Language language, BindingResult result) {
    	List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "language.jsp";
    }
	
	 @RequestMapping("/languages/{index}")
	    public String findLanguageByIndex(Model model, @PathVariable("index") int index) {
		 model.addAttribute("language", languageService.findLanguageByIndex(index));
	        return "showLanguage.jsp";
	    }
	 
	 @RequestMapping("/languages/new")
	    public String newLanguage(@ModelAttribute("language") Language language) {
	        return "newLanguage.jsp";
	    }
	 
	  @PostMapping("/languages/new")
	    public String createLanguage(Model model, @Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	        	List<Language> languages = languageService.allLanguages();
	            model.addAttribute("languages", languages);
	        	 return "language.jsp";

	        }else{
	            languageService.addLanguage(language);
	            return "redirect:/languages";
	        }
	    }
	  
	  @RequestMapping("/languages/edit/{id}")
	    public String editLanguages(@PathVariable("id") int id, Model model) {
		  Language language = languageService.findLanguageByIndex(id);
	        if (language != null){
	            model.addAttribute("language", language);
	            return "editLanguage.jsp";
	        }else{
	            return "redirect:/languages";
	        }
	    }
	  
	  @PostMapping("/languages/edit/{id}")
	    public String updateLanguages(@PathVariable("id") int id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "editLanguage.jsp";
	        }else{
	            languageService.updateLanguage(id, language);
	            return "redirect:/languages";
	        }
	    }
	  
	  @RequestMapping(value="/languages/delete/{id}")
	    public String destroyLanguages(@PathVariable("id") Long id) {
	        languageService.destroyLanguage(id);
	        return "redirect:/languages";
	    }
}