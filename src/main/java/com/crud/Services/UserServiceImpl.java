package com.crud.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Entity.User;
import com.crud.Repository.Repository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private Repository repo;

	@Override
	public User addUser(User user) {
		repo.save(user);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public User deleteUser(long id) {
		repo.deleteById(id);
		return user;
		
	}

}
