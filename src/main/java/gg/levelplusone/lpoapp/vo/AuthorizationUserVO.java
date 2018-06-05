package gg.levelplusone.lpoapp.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AuthorizationUserVO {

	@NotNull
	@NotEmpty
	private String username;
	
	@NotNull
	@NotEmpty
	private String password;
	
	@NotNull
	@NotEmpty
	private String firstName;
	
	@NotNull
	@NotEmpty
	private String lastName;
	
	@NotNull
	@NotEmpty
	private String email;
	
	private String matchingPassword;
	
	
	
}
