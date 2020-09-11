package com.vastika.smd.service;

import java.util.List;

import com.vastika.smd.model.User;

public interface UserService {
	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	List<User> getAllUser();

	User getUserById(int id);
}
