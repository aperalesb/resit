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
 * Modelo del objeto País.
 * 
 * @author aperalesb
 * 
 */
@Entity
@Table(name = "country")
//@NamedQuery(name = "country.findByCountryId", query = "from Country where ID = :id")
public class Country implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="continent_fk",referencedColumnName="ID")
	private Continent continent;

	@Override
	public String toString() {
		return "Country [ID=" + id + ", name=" + name + "]";
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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

		Country other = (Country) obj;

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