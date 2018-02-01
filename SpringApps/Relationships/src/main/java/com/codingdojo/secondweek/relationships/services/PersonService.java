package com.codingdojo.secondweek.relationships.services;

import java.util.List;




import org.springframework.stereotype.Service;


import com.codingdojo.secondweek.relationships.models.Person;
import com.codingdojo.secondweek.relationships.repositories.PersonRepository;

@Service
public class PersonService {

	private PersonRepository pr;
	
	public PersonService(PersonRepository pr) {
		this.pr = pr;
	}
	
//	public List<Person> getAllPersons() {
//		return (List<Person>) pr.findAll();
//	}
//	
//	
	
	public List<Person> findAll(){
		return (List<Person>) pr.findAll();
	}
	
	public void addPerson(Person person) {
		pr.save(person);
	}
	public Person findPerson(Long id) {
		return pr.findOne(id);
	
	}
	public void destroyPerson(Long id) {
		pr.delete(id);
	}}
//	public List<Person> findPerson(String search){
//	
//		return pr.findByFirstName(search);
//		
//	}
//	public List<Person> findBySurName(String search){
//		
//		return pr.findByLastName(search);
//	 
//	
//	}
//	



