package net.zq.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import net.zq.dao.UserDAO;
import net.zq.model.User;

@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<User> getUsers() {
        @SuppressWarnings("unchecked")
        List<User> list=this.hibernateTemplate.find("from User");
        return list;
	}

	@Override
	public User getUserById(String id) {
		return this.hibernateTemplate.get(User.class, id);
	}

}
