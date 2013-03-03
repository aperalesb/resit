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
 * Modelo del objeto Descuento.
 * @author aperalesb
 *
 */
@Entity
@Table(name="discount")
@NamedQuery(name="discount.findByDiscountId", query="from Discount where ID = :id")
public class Discount extends AbstractPersistable<Long> implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="PUBLICATIONTIME")
	private Date publicationTime;
	@Column(name="EXPIRATIONTIME")
	private Date expirationTime;
	@Column(name="DISCOUNTEDVALUE")
	private Long discountedValue;
	
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