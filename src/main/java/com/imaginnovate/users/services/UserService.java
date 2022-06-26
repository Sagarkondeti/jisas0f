package com.imaginnovate.users.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.users.models.Users;
import com.imaginnovate.users.repos.UsersRepository;

@Service
public class UserService {
	@Autowired
	UsersRepository usersRepository;
	
    public Users saveUsers(Users users) {
    	return usersRepository.save(users);
    }
    
    public List<Users> getUsers() {
    	return usersRepository.findAll();
    }
    
	public Optional<Users> getById(int id) {
    	return usersRepository.findById(id);
    }
	
	
    
}
