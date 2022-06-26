package com.imaginnovate.users.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.users.models.Users;
import com.imaginnovate.users.services.UserService;

@RestController
public class UsersController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/addusers",method = RequestMethod.POST)
	public Users saveUsers(@RequestBody Users users) {
		return userService.saveUsers(users);
	}
     
	@RequestMapping(value = "/getallusers",method = RequestMethod.GET)
	public List<Users> getUsers() {
		return userService.getUsers();
	}
	
	@RequestMapping(value = "/getbyid/{id}",method = RequestMethod.GET)
	public Optional<Users> getById(@PathVariable("id") int id) {
		return userService.getById(id);
	}
	
	@RequestMapping(value = "/getbyid",method = RequestMethod.GET)
	public Optional<Users> getById1(@RequestParam int id) {
		return userService.getById(id);
	}
	
	
}
