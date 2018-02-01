package com.codingdojo.secondweek.ninjagold;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
	// score and log initialize
	Integer score;
	ArrayList<String> log = new ArrayList<String>();
	
	
  public String message(int result, String place) {
	String output = null;
	SimpleDateFormat sdf = new SimpleDateFormat("EEEE 'the' d 'of' MMMM',' y HH:mm:ss a");
	Date now = new Date();
	String dateAsString = sdf.format(now);
	
	if(result>0) {
		// positive message
		output = "You entered a " + place + " and earned " + result + " gold   (" + dateAsString + ")";
	} else {
		// negative message
		output = "You entered a " + place + " and lost " + result + " gold  Ouch.. (" + dateAsString + ")";
  		}
  		
  		return output;
  }
  
  public int randomNumber(int min, int max){
      int range = (max - min) + 1;
      return (int)(Math.random() * range) + min;
  }

	
    @RequestMapping("/")
    public String index(Model model) {
    	
    // if this is a new game:
    	if(score == null) { 
    		score = 0; 
    		
    	}
    	else {
    	model.addAttribute("score", score);
    	model.addAttribute("log", log);
    	}
    return "index";
    }
    
    
 @RequestMapping(path="/Gold", method=RequestMethod.POST)
    public String resultsPost( 
    		@RequestParam(value="activity", defaultValue="empty") String activity
    		) {
    		int resultOfgame;
    		// if pushed farm
    		if(activity.equals("farm")) {
    			resultOfgame = randomNumber(10, 20);
    			log.add(message(resultOfgame,activity));
    			this.score += resultOfgame;
    		// if pushed cave
    		} else if(activity.equals("cave")) {
    			resultOfgame = randomNumber(5, 10);
    			log.add(message(resultOfgame,activity));
    			this.score += resultOfgame;
        	// if pushed house
    		} else if(activity.equals("house")) {
    			resultOfgame = randomNumber(2, 5);
    			log.add(message(resultOfgame,activity));
    			this.score += resultOfgame;
        	// if pushed casino
    		}else if(activity.equals("casino")) {
    			resultOfgame = randomNumber(-50, 50);
    			log.add(message(resultOfgame,activity));
    			this.score += resultOfgame;
    		// if pushed reset
    		}
    		else if(activity.equals("reset")) {
	    		this.score *= 0;
	    		this.log = new ArrayList<String>();
	    }
    			System.out.println(activity);

            return "redirect:/";
    }
    
 
}
