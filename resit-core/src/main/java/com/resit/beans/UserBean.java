package com.resit.beans;

public class UserBean {
	private Long id;
	private String login;
	private String password;
	private boolean enabled;

	public UserBean(Long id, String login, String password, boolean enabled) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.enabled = enabled;
	}

	public UserBean() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
