package com.money.control.app.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.money.control.app.dao.UserDAO;
import com.money.control.app.models.User;

@Repository
@SuppressWarnings("unchecked")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> getAllUsers() {
		Session sess = sessionFactory.openSession();
		Query q = sess.createQuery("From User");
		return (List<User>) q.list();
	}

}
