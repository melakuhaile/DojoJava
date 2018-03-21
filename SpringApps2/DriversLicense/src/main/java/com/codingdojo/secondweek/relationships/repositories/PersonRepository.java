package com.codingdojo.secondweek.relationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.secondweek.relationships.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

}