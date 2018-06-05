package gg.levelplusone.lpoapp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gg.levelplusone.lpoapp.model.User;
import gg.levelplusone.lpoapp.model.UserProfile;
import gg.levelplusone.lpoapp.model.UserRole;
import gg.levelplusone.lpoapp.repository.UserRepository;
import gg.levelplusone.lpoapp.vo.AuthorizationUserVO;

@Service
@Transactional
public class RegisterUserService {
	
	@Autowired
	UserRepository userRepository;

	public User registerUser (AuthorizationUserVO authUser) {
		
		
		User newUser = mapUserVOtoPO(authUser);
		
		return userRepository.save(newUser);
		
		
	}

	private User mapUserVOtoPO(AuthorizationUserVO authUser) {
		//General User Info
		User newUser = new User();
		newUser.setEnabled(true);
		newUser.setUsername(authUser.getUsername());
		newUser.setPassword(authUser.getPassword()); //TODO hash password
		newUser.setEmail(authUser.getEmail());
		
		//User Role Info
		UserRole role = new UserRole();
		role.setUser(newUser);
		role.setRole("User");
		newUser.setUserRoles(new ArrayList<UserRole>());
		newUser.getUserRoles().add(role);
		
		//User Profile Info
		UserProfile profile = new UserProfile();
		profile.setFirstName(authUser.getFirstName());
		profile.setLastName(authUser.getLastName());
		profile.setUser(newUser);
		newUser.setUserProfile(profile);
		
		return newUser;
		
		
	}
	
	
}
