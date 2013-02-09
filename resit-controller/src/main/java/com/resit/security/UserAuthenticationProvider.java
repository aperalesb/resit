package com.resit.security;

import java.util.Collection;
import java.util.HashSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

import com.resit.controller.UserController;

public class UserAuthenticationProvider implements AuthenticationProvider {

	/**
     * Log.
     */
	private final static Logger LOG = Logger.getLogger(UserAuthenticationProvider.class);

    private static final String ROLE_LOGGED = "ROLE_LOGGED";

    @SuppressWarnings("deprecation")
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Authentication authent = null;
        String login = authentication.getName();
        String password = authentication.getCredentials().toString();
        if (checkLogin(login, password)){
        	Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>(1);
        	authorities.add(new GrantedAuthorityImpl(ROLE_LOGGED));
        	authent = new UsernamePasswordAuthenticationToken(login, password, authorities);
        }
        else{
        	throw new BadCredentialsException("Login or password incorrect.");
        }
        return authent;
    }

	private boolean checkLogin(String login, String pass) {
		LOG.info("Autenticando al usuario: " + login);
		return "heavywizard@gmail.com".equals(login) && "pass".equals(pass);
	}

    public boolean supports(Class authentication) {
        return true;
    }

}
