package com.resit.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.resit.beans.UserBean;
import com.resit.core.services.IUserService;
import com.resit.security.beans.AuthenticationUserDetails;

public class AuthenticationUserDetailsGetter implements UserDetailsService {

	@Autowired
	private IUserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserBean user = userService.getUserDetailsByUsername(username);
		return new AuthenticationUserDetails(user);
	}

}
