package com.resit.core.services;

import com.resit.beans.UserBean;

public interface IUserService {

	/**
	 * Autentica al usuario a partir del login
	 * @param login
	 * @param password
	 * @return
	 */
	UserBean getUserDetailsByUsername(String login);

	UserBean getUserDetailsByUsernamePassword(String login, String password);

}
