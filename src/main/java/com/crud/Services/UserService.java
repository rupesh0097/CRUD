package com.crud.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.Entity.User;

public interface UserService {
	
	public User addUser(User user);
	public List<User> getAllUsers();
	public User deleteUser(long id);

}
