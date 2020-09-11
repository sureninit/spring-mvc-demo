package com.vastika.smd.dao;

import java.util.List;

import com.vastika.smd.model.User;

public interface UserDao {
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(int id);
	
	List<User> getAllUser();
	 
	User getUserById(int id);

}
