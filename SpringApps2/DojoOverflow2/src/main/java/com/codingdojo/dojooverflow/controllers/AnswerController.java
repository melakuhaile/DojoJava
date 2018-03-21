package com.codingdojo.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.models.Question;
import com.codingdojo.dojooverflow.services.AnswerService;
import com.codingdojo.dojooverflow.services.QuestionService;

@Controller
public class AnswerController {
	private AnswerService answerService;
	private QuestionService questionService;
	
	public AnswerController(AnswerService answerService, QuestionService questionService) {
		this.answerService = answerService;
		this.questionService = questionService;
	}
	
	@PostMapping("/{question_id}/addAnswer")
	public String addAnswer(@Valid @ModelAttribute("newAnswer") Answer answer, 
			@PathVariable("question_id") Long id, BindingResult result) {
		if(result.hasErrors()) {
			return "showQuestion";
		} else {
			Question question = questionService.findQuestionById(id);
			answer.setQuestion(question);
			answerService.addAnswer(answer);
			return "redirect:/questions/" + id;
		}
	}
	
}
