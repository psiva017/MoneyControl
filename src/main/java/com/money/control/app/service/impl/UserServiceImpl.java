package com.money.control.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.control.app.dao.UserDAO;
import com.money.control.app.models.User;
import com.money.control.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();

	}
}
