package com.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.dao.UserDAO;
import com.in.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO dao;

	public User createUser(User user) {
		return dao.save(user);
	}

	public User updateUser(User user) {
		return dao.save(user);
	}

	public Optional<User> findById(int id) {
		return dao.findById(id);
	}

	public void deleteUser(User user) {
		dao.delete(user);
	}

	public Iterable<User> getAllUsers() {
		return dao.findAll();
	}

	public List<User> findAll() {
		return dao.findAll();
	}

//	public List<User> findByLname(String lName) {
//		return dao.findByLname(lName);
//	}
//
//	public List<User> findByFnameAndLname(String fName, String lName) {
//		return dao.findByFnameAndLname(fName, lName);
//	}
}
