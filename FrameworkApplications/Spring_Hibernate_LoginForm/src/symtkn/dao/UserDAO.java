package symtkn.dao;

import java.util.List;

import symtkn.pojo.User;

public interface UserDAO {
	
	public void saveUser(User user) ;
	public List<User> listUser() ;

}
