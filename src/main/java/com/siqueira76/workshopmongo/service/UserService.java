package com.siqueira76.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siqueira76.workshopmongo.domain.User;
import com.siqueira76.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}

}
