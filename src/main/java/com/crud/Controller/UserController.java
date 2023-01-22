package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Entity.User;
import com.crud.Services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		// the action performed by the addUser method are written in services
		 userService.addUser(user);
		 return "User Added Sucessfully";
	}
	
	
	@GetMapping("/alluser")
	public List<User> getAllUser(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/delete")
	public String deleteUser(long id) {
		
		return "User Deleted Sucessfully";
	}

}
