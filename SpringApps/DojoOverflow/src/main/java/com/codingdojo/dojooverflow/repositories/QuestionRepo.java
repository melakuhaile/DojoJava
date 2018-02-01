package com.codingdojo.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;


import com.codingdojo.dojooverflow.models.Question;

public interface QuestionRepo extends CrudRepository<Question, Long> {

}