package com.codingdojo.javabeltexam.repositories;

import org.springframework.data.repository.CrudRepository;


import java.util.List;


import org.springframework.stereotype.Repository;

import com.codingdojo.javabeltexam.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
	List<User> findAll();
	 User findById(Long id);
}
