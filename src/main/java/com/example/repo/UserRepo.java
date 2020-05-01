package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.domain.User;


public interface UserRepo extends CrudRepository <User, Integer> {
	
	User findByUsername (String username);
	
	

}
