package com.codingdojo.auth.repositories;

import org.springframework.stereotype.Repository;




import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.auth.models.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	
	    List<Role> findAll();
	    
	    List<Role> findByName(String name);
	}
