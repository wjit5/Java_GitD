package com.main.login.dao;

import java.util.List;

import com.main.login.entity.Users;

public interface UsersDao {
	
	public boolean SaveUsers(Users users);
	public boolean UpdateUsers(Users users);
	public boolean DeleteUsers(int id);
	public List<Users> findAllUser();
	public Users getUsersById(int id);
	
}
