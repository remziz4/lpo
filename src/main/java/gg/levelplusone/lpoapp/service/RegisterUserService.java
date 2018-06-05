package gg.levelplusone.lpoapp.service;

import gg.levelplusone.lpoapp.model.User;
import gg.levelplusone.lpoapp.vo.AuthorizationUserVO;

public class RegisterUserService {

	public static User registerUser (AuthorizationUserVO authUser) {
		
		//TODO Implement Registration Logic
		
		if (authUser != null && authUser.getUsername() != null) {
			User user = new User();
			user.setUsername(authUser.getUsername());
			return user;
		} else {
			return null;
		}
	}
}
