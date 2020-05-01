package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repo.UserRepo;

@Service
public class UserRepositoryUserDetailsService implements UserDetailService {
	private UserRepo userRepo;

	
	
	@Autowired
	public UserRepositoryUserDetailsService(UserRepo userRepo) {
		
		this.userRepo = userRepo;
	}
	
	
	
	
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		if (user != null) {
			return user;
		}
		throw new UsernameNotFoundException("User " + username + "not found");
	}



	
	
	
	
}
