package net.zq.dao;

import java.util.List;

import net.zq.model.User;

public interface UserDAO {
	public List<User> getUsers();
	public User getUserById(String id);
}
