package net.project.login.service;

import net.project.login.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	 
	public void saveUser(User user);
}
