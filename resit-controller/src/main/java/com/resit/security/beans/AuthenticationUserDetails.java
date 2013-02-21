package com.resit.security.beans;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

import com.resit.beans.UserBean;
import com.resit.security.constants.ConstantsRole;

public class AuthenticationUserDetails implements UserDetails {

	private Long id;
	private final String login;
	private final String passwordHash;
	private final boolean enabled;
	private HashSet<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();

	public AuthenticationUserDetails(UserBean user) {
		this.login = user.getLogin();
		this.passwordHash = user.getPassword();
		this.enabled = user.isEnabled();
		this.grantedAuthorities.add(new GrantedAuthorityImpl(ConstantsRole.ROLE_LOGGED));
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		return passwordHash;
	}

	@Override
	public String getUsername() {
		return login;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	public String getLogin() {
		return login;
	}

}
