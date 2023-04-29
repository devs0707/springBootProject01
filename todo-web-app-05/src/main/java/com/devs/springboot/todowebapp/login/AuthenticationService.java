package com.devs.springboot.todowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String userName, String password) {
		
		boolean isValidUsername = userName.equalsIgnoreCase("devs");
		boolean isValidPassword = password.equalsIgnoreCase("pass");
		return isValidUsername && isValidPassword;
	}

}
