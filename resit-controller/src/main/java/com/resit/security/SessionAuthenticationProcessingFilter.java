package com.resit.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.resit.common.ControllerParamConstants;

public class SessionAuthenticationProcessingFilter extends	AbstractAuthenticationProcessingFilter {

	private final static Logger LOG = Logger.getLogger(SessionAuthenticationProcessingFilter.class);
	
	protected SessionAuthenticationProcessingFilter() {
		super("/login.do");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException,
			IOException, ServletException {

        String parameter = request.getParameter(ControllerParamConstants.LOGIN_EMAIL);
		LOG.info("Autenticando al usuario: "+parameter);
		return null;
	}

}
