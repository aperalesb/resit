/**
 * 
 */
package com.resit.remote.jpa.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Modelo del objeto Estado o Provincia.
 * @author aperalesb
 *
 */
@Entity
@Table(name="state")
@NamedQuery(name="state.findByStateId", query="from State where ID_STATE = :id")
public class State implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="country_fk",referencedColumnName="ID")
	private Country country;
	
	@Override
	public String toString() {
		return "Commerce [ID=" + id + ", name=" + name + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result	+ ((name == null) ? 0 : name.hashCode());
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
		
		State other = (State) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
			
		} else if (!id.equals(other.id)) {
			return false;
		}
		
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		
		return true;
	}
}