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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Modelo del objeto Contrato.
 * @author aperalesb
 *
 */
@Entity
@Table(name="contract")
//@NamedQuery(name="contract.findById", query="from Contract where ID = :id")
public class Contract implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="INIT_TIME")
	private Date initTime;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATION_TIME")
	private Date expirationTime;
	
	@Column(name="FEE")
	private Long fee;
	
	@Column(name="RENOVATION")
	private Boolean renovation;
	
	@Override
	public String toString() {
		return "Commerce [ID=" + id + ", initTime=" + initTime.getTime() + ", expirationTime=" + expirationTime.getTime() + 
				", fee=" + fee + ", " + "renovation=" + renovation + "]";
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInitTime() {
		return initTime;
	}

	public void setInitTime(Date initTime) {
		this.initTime = initTime;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Boolean getRenovation() {
		return renovation;
	}

	public void setRenovation(Boolean renovation) {
		this.renovation = renovation;
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
		
		Contract other = (Contract) obj;
		
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