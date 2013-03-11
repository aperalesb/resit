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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Modelo del objeto Descuento.
 * @author aperalesb
 *
 */
@Entity
@Table(name="discount")
//@NamedQuery(name="discount.findById", query="from Discount where ID = :id")
public class Discount implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="PUBLICATION_TIME")
	private Date publicationTime;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATION_TIME")
	private Date expirationTime;
	
	@Column(name="DISCOUNTED_VALUE")
	private Long discountedValue;
	
	@ManyToOne
    @JoinColumn(name="commerce_fk",referencedColumnName="ID")
	private Commerce commerce;
	
	@Override
	public String toString() {
		return "Commerce [ID=" + id + ", publicationTime=" + publicationTime.getTime() + 
				", expirationTime=" + expirationTime.getTime() + ", discountedValue=" + discountedValue + "]";
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPublicationTime() {
		return publicationTime;
	}

	public void setPublicationTime(Date publicationTime) {
		this.publicationTime = publicationTime;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public Long getDiscountedValue() {
		return discountedValue;
	}

	public void setDiscountedValue(Long discountedValue) {
		this.discountedValue = discountedValue;
	}
	
	public Commerce getCommerce() {
		return commerce;
	}

	public void setCommerce(Commerce commerce) {
		this.commerce = commerce;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result	+ ((publicationTime == null) ? 0 : publicationTime.hashCode());
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
		
		Discount other = (Discount) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
			
		} else if (!id.equals(other.id)) {
			return false;
		}
		
		if (publicationTime == null) {
			if (other.publicationTime != null) {
				return false;
			}
		} else if (!publicationTime.equals(other.publicationTime)) {
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