package com.codingdojo.dojooverflow.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.models.Question;
import com.codingdojo.dojooverflow.repositories.QuestionRepo;

@Service
public class QuestionService {
	private QuestionRepo questionRepo;
	
	public QuestionService(QuestionRepo questionRepo) {
		this.questionRepo = questionRepo;
	}
	
	public List<Question> allQuestions() {
		return (List<Question>) questionRepo.findAll();
	}
	
	public void addQuestion(Question question) {
		questionRepo.save(question);
	}
	
	public Question findQuestionById(Long id) {
		return questionRepo.findOne(id);
	}
	
	public void updateQuestion(Question question) {
		questionRepo.save(question);
	}
}
