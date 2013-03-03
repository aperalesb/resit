/**
 * 
 */
package com.resit.remote.jpa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Modelo del objeto Continente.
 * @author aperalesb
 *
 */
@Entity
@Table(name="continent")
@NamedQuery(name="continent.findByContinentId", query="from Continent where ID = :id")
public class Continent extends AbstractPersistable<Long> implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="NAME")
	private String name;
	@OneToMany 
	private List<Country> countries;
	
	@Override
	public String toString() {
		return "Continent [ID=" + id + ", name=" + name + countries.toArray() + "]";
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
	
	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
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
		
		Continent other = (Continent) obj;
		
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