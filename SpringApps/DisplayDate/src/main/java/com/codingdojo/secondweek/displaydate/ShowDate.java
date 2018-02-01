package com.codingdojo.secondweek.displaydate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.Date;
import org.springframework.stereotype.Controller;
import java.text.SimpleDateFormat;

@Controller
public class ShowDate {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/date")
	public String showDate(Model model) {
		SimpleDateFormat dateFrmt = new SimpleDateFormat("EEEE', the 'd' of 'MMMM', 'yyyy");
		Date today = new Date();
		model.addAttribute("date", dateFrmt.format(today));
		return "showDate";
	}
	
	@RequestMapping("/time")
	public String showTime(Model model) {
		SimpleDateFormat timeFrmt = new SimpleDateFormat("h:mm a");
		Date today = new Date();
		model.addAttribute("time", timeFrmt.format(today));
		return "currentTime";
	}
}
