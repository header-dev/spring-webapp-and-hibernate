package com.idevalot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("kritawit");
		boolean isValidPassword = password.equalsIgnoreCase("Debuger@3011");

		return isValidUserName && isValidPassword;

	}

}
