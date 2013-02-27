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
 * Modelo del objeto Tienda.
 * @author aperalesb
 *
 */
@Entity
@Table(name="company")
@NamedQuery(name="company.findByCompanyId", query="from Company where ID_COM = :id")
public class Company extends AbstractPersistable<Long> implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID_CON")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="IDENTIFICATION")
	private String identification;
	@Column(name="NAME")
	private String name;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PHONE")
	private Long phone;
	@Column(name="RETURN_PERIOD")
	private Date return_period;
	
	@Override
	public String toString() {
		return "Company [ID_COM=" + id + ", identification=" + identification + ", name=" + name + ", " +
				"address=" + address + ", phone=" + phone + ", return_period=" + return_period.getTime() + "]";
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Date getReturn_period() {
		return return_period;
	}

	public void setReturn_period(Date return_period) {
		this.return_period = return_period;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result	+ ((identification == null) ? 0 : identification.hashCode());
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
		
		Company other = (Company) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
			
		} else if (!id.equals(other.id)) {
			return false;
		}
		
		if (identification == null) {
			if (other.identification != null) {
				return false;
			}
		} else if (!identification.equals(other.identification)) {
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