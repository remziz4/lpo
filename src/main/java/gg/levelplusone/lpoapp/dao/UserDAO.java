package gg.levelplusone.lpoapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gg.levelplusone.lpoapp.model.User;

public class UserDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);
	

	
	public boolean createUser(User user) {
		logger.debug("Entering UserDAO.createUser()");
		return true;
		
		
		
	}
	
}
