package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.User;
import com.example.repo.UserRepo;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	
	@PostMapping ("/registration")
	public String addNewUser(User user, Map<String, Object> model) {
		User userFromDB = userRepo.findByUsername(user.getUsername());
		
		if (userFromDB != null) {
			model.put("message", "User Exist");
			return "registration";
		}
		userRepo.save(user);
		
		return "login";
		
	}
}
