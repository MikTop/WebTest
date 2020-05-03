package com.example.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.User;
import com.example.repo.UserRepo;

//@Controller
public class GreetingController {
    @Autowired
    private UserRepo userRepo;
    
    

    public GreetingController(UserRepo userRepo) {
		
		this.userRepo = userRepo;
	}

	

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<User> users = userRepo.findAll();

        model.put("users", users);

        return "main";
    }

    @PostMapping
    public String add(@RequestParam String name, @RequestParam String email, Map<String, Object> model) {
        
        User user = new User  (name, email);

        userRepo.save(user);

        Iterable<User> users = userRepo.findAll();

        model.put("users", users);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<User> users;

        if (filter != null && !filter.isEmpty()) {
           // users = userRepo.findByUsername(filter);  *** old version code
        } else {
        	users = userRepo.findAll();
        }

       // model.put("users", users);   *** old version code

        return "main";
    }
}