package com.aparna.dao;

import java.util.List;

import com.aparna.model.User;

public interface UserDAO {
	public void saveUser(User user);
	public void deleteUser(User user);
	public List<User> getUser(int id);
	

}
