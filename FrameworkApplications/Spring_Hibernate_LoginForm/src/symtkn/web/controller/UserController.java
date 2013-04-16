package symtkn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction. MultiActionController;
import symtkn.dao.*;
import symtkn.pojo.*;

public class UserController extends MultiActionController {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, User user) throws Exception {
		userDAO.saveUser(user);
		return new ModelAndView("redirect:list.htm");
	}

	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("user", new User());
		modelMap.addAttribute("userList", userDAO.listUser());
		return new ModelAndView("userForm", modelMap);
	}
}