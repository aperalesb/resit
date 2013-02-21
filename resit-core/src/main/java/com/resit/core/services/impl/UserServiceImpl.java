package com.resit.core.services.impl;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.resit.beans.UserBean;
import com.resit.core.services.IUserService;

/**
 * 
 * @author Amin
 *
 */
@Service
public class UserServiceImpl implements IUserService {

	@Override
	public UserBean getUserDetailsByUsernamePassword(final String login, final String password){
		if (login != null && login.equals("heavywizard@gmail.com") &&
			password != null && login.equals("pass")){
			return getUserDetailsByUsername(login);
		}
		else{
			throw new UsernameNotFoundException("User not found");
		}

	}

	@Override
	public UserBean getUserDetailsByUsername(String login) {
		return new UserBean(1L, login, "pass", true);
	}
}
