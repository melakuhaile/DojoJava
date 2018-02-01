package com.codingdojo.auth.services;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;
import com.codingdojo.auth.models.User;
import com.codingdojo.auth.models.Role;
import com.codingdojo.auth.repositories.RoleRepository;
import com.codingdojo.auth.repositories.UserRepository;





@Service
public class UserService {
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
		
	public void saveWithUserRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_USER"));
		userRepository.save(user);
	}
	
	public void saveWithAdminRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
		userRepository.save(user);
	}
	
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public List<Role> findAllRoles(){
		return roleRepository.findAll();
	}
	
	public List<Role> findRoleByName(String name) {
		return roleRepository.findByName(name);
	}
	
	public void destroyUser(Long id) {
		userRepository.delete(id);
	}
	
//	public int getCountOfAdminRoleUser() {
//	    	return userRepository.getCountOfAdminRoleUser();
//	    }
//	
	
	
	public void createAdmin(Long id) {
		User user = userRepository.findOne(id);
		user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
		userRepository.save(user);
	}
		
	
}

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    