package com.springboot.library.mavenproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.library.mavenproject.model.UserLogin;
import com.springboot.library.mavenproject.repository.LoginPageRepository;

@RestController
public class LoginPageController {

	@Autowired
	LoginPageRepository repo;

	
    @GetMapping("/reg")
    public String Loginform() {
    	return "register";
    }
    
    
}
