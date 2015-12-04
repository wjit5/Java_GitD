package com.main.login.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.main.login.dao.UsersDao;
import com.main.login.entity.Users;

public class UsersDaoImpl extends BaseDaoImpl implements UsersDao {

	@Override
	public boolean SaveUsers(Users users) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		
		
		
		return false;
	}

	@Override
	public boolean UpdateUsers(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUsers(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Users> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUsersById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
