package com.main.login.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.main.login.dao.BaseDao;

public class BaseDaoImpl implements BaseDao{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		
		return sessionFactory.openSession();
	}
}
