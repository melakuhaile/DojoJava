package com.codingdojo.auth.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.auth.models.User;
import com.codingdojo.auth.models.Role;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
 User findByUsername(String username);
 


}
