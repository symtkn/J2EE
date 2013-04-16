package symtkn.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import symtkn.pojo.User;

public class UserDAOImpl implements UserDAO {
	
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {
		return hibernateTemplate.find("from User");
	}

}
