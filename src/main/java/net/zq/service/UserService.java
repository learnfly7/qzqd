package net.zq.service;

import java.util.List;

import net.zq.model.User;

public interface UserService {
	public List<User> getUsers();
	public User getUserById(String id);
}
