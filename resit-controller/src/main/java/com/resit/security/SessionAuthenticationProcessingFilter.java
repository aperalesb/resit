package com.resit.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.core.Constants;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.resit.common.constants.ControllerParamConstants;

public class SessionAuthenticationProcessingFilter extends
		AbstractAuthenticationProcessingFilter {

	private final static Logger LOG = Logger
			.getLogger(SessionAuthenticationProcessingFilter.class);

	protected SessionAuthenticationProcessingFilter() {
		super("/home.do");
		setAuthenticationSuccessHandler(new SimpleUrlAuthenticationSuccessHandler() {
            @Override
            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                    Authentication authentication) throws IOException, ServletException {
                super.onAuthenticationSuccess(request, response, authentication);
            }

            @Override
            protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response) {
                return request.getRequestURL().toString();
            }
        });
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException,
			IOException, ServletException {
		UsernamePasswordAuthenticationToken authenticate = null;
		String login = request
				.getParameter(ControllerParamConstants.LOGIN_EMAIL);
		String pass = request
				.getParameter(ControllerParamConstants.LOGIN_PASSWORD);

		if (login != null && login.length() > 0) {
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(login, pass);
			authenticate = (UsernamePasswordAuthenticationToken) this
					.getAuthenticationManager().authenticate(token);
		}
		return authenticate;
	}

	@Override
	protected boolean requiresAuthentication(HttpServletRequest request,
			HttpServletResponse response) {
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		return authentication == null || !authentication.isAuthenticated();
	}

}
