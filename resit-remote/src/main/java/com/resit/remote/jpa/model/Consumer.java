/**
 * 
 */
package com.resit.remote.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Modelo del objeto Consumer.
 * @author aperalesb
 *
 */
@Entity
@Table(name="consumer")
@NamedQuery(name="users.findByConsumerId", query="from Consumer where ID = :id")
public class Consumer extends AbstractPersistable<Long> implements Serializable  {
	private static final long serialVersionUID = 3697535594187479699L;
	@Id
	@Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="ACTIVE")
	private Boolean active;
	@Column(name="ENABLED")
	private Boolean enabled;
	
	@Override
	public String toString() {
		return "Consumer [ID=" + id + ", username=" + username + ", password=" + password + ", " +
				"active=" + active + ", enabled=" + enabled + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id_con) {
		this.id = id_con;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result	+ ((username == null) ? 0 : username.hashCode());
		result = prime * result	+ ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Consumer other = (Consumer) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
			
		} else if (!id.equals(other.id)) {
			return false;
		}
		
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		
		return true;
	}
}