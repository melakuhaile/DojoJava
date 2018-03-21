package com.codingdojo.secondweek.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {

	
	@RequestMapping("/")
	public String index(
			Model model,
			@ModelAttribute("errors") String errors
			) {
		
		model.addAttribute("errors", errors);
		//System.out.println(errors);
		return "index";
	}
	
    @RequestMapping(path="/code", method=RequestMethod.POST)
    public String codePOST(
    		RedirectAttributes redirectAttributes,
    		@RequestParam(value="codeInput", defaultValue="") String codeInput
    		){
    		if( codeInput.equals("bushido") ) {
    			return "code";
    		}
    		
        redirectAttributes.addFlashAttribute("errors", "YOU MUST TRAIN HARDER!");
        return "redirect:/";
    }
    
    
}