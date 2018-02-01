package com.codingdojo.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;


import com.codingdojo.dojooverflow.models.Answer;

public interface AnswerRepo extends CrudRepository<Answer, Long> {

}