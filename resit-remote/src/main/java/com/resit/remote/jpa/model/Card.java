/**
 * 
 */
package com.resit.remote.jpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Modelo del objeto Card.
 * @author aperalesb
 *
 */
@Entity
@Table(name="card")
@NamedQuery(name="card.findByCardId", query="from Card where ID = :id")
public class Card extends AbstractPersistable<Long> implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="EXPIRATIONTIME")
	private Date expirationTime;
	@Column(name="TYPE")
	private String type;
	@Column(name="INITTIME")
	private Date initTime;
	
	@Override
	public String toString() {
		return "Commerce [ID=" + id + ", expirationTime=" + expirationTime.getTime() + ", type=" + type + 
				", iniTime=" + initTime.getTime() + "]";
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getInitTime() {
		return initTime;
	}

	public void setInitTime(Date initTime) {
		this.initTime = initTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result	+ ((initTime == null) ? 0 : initTime.hashCode());
		result = prime * result	+ ((expirationTime == null) ? 0 : expirationTime.hashCode());
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
		
		Card other = (Card) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
			
		} else if (!id.equals(other.id)) {
			return false;
		}
		
		if (initTime == null) {
			if (other.initTime != null) {
				return false;
			}
		} else if (!initTime.equals(other.initTime)) {
			return false;
		}
		
		if (expirationTime == null) {
			if (other.expirationTime != null) {
				return false;
			}
		} else if (!expirationTime.equals(other.expirationTime)) {
			return false;
		}
		
		return true;
	}
}