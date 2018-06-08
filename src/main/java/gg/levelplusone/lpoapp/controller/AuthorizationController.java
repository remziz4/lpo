package gg.levelplusone.lpoapp.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gg.levelplusone.lpoapp.model.User;
import gg.levelplusone.lpoapp.service.RegisterUserService;
import gg.levelplusone.lpoapp.vo.AuthorizationUserVO;

@RestController()
@RequestMapping("/auth")
public class AuthorizationController {
	
	Logger logger = LoggerFactory.getLogger(AuthorizationController.class);
	
	@Autowired
	RegisterUserService registrationService;


	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ResponseEntity<String> registerUserAccount(@RequestBody @Valid AuthorizationUserVO authUser) {
		logger.debug("Entered AuthorizationController.registerUserAccount");
		System.out.println(authUser);
		
		User registered = registrationService.registerUser(authUser);
		
		if(registered == null) {
			return new ResponseEntity<String>("failed", HttpStatus.valueOf(500));
		}
		
		logger.debug("Exiting AuthorizationController.registerUserAccount");
		return new ResponseEntity<String>("Account created for " + registered.getUsername(), HttpStatus.OK);
		
	}
	
	

}
