package com.resit.security;

import java.util.Collection;
import java.util.HashSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

import com.resit.controller.UserController;

public class ResitAuthenticationProvider implements AuthenticationProvider {

	/**
     * Log.
     */
	private final static Logger LOG = Logger.getLogger(ResitAuthenticationProvider.class);

    private static final String ROLE_LOGGED = "ROLE_LOGGED";

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Authentication authent = null;
        return authent;
    }

    public boolean supports(Class authentication) {
        return true;
    }

}
