package com.springboot.library.mavenproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.library.mavenproject.model.UserLogin;

public interface LoginPageRepository  extends JpaRepository<UserLogin, String>{

}
