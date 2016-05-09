package net.zq.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.zq.dao.UserDAO;
import net.zq.model.User;
import net.zq.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> getUsers() {
		return this.userDAO.getUsers();
	}

	@Override
	public User getUserById(String id) {
		return this.userDAO.getUserById(id);
	}

}
