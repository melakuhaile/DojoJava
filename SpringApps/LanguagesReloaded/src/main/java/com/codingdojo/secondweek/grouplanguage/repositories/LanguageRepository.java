package com.codingdojo.secondweek.grouplanguage.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.codingdojo.secondweek.grouplanguage.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}