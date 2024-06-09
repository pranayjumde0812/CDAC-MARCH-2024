package com.utils;

import com.entities.User;
import com.exceptions.AuthenticationException;

public class UserUtils {

	public static String login(User[] arr, String loginId, String password) throws AuthenticationException {

		for (User user : arr) {
			if (user.getLoginId().equals(loginId) && user.getPassword().equals(password)) {
				return user.getLoginId();
			}
		}
		throw new AuthenticationException("Invalid User or Password");
	}
}
