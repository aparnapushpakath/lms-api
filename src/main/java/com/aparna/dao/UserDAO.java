package com.aparna.dao;

import java.util.List;

import com.aparna.model.User;

public interface UserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUser(int id);
	public List<User> getAllUsers();
	

}
