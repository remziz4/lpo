package gg.levelplusone.lpoapp.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gg.levelplusone.lpoapp.model.User;
import gg.levelplusone.lpoapp.service.RegisterUserService;
import gg.levelplusone.lpoapp.vo.AuthorizationUserVO;

@RestController()
@RequestMapping("/auth")
public class AuthorizationController {


	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ResponseEntity<String> registerUserAccount(@Valid AuthorizationUserVO authUser) {
		
		User registered = RegisterUserService.registerUser(authUser);
		
		if(registered == null) {
			return ResponseEntity.ok("success");
		}
		
		return ResponseEntity.ok("success");
		
	}
	
	

}
