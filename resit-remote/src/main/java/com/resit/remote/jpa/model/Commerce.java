/**
 * 
 */
package com.resit.remote.jpa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Modelo del objeto Tienda.
 * @author aperalesb
 *
 */
@Entity
@Table(name="commerce")
//@NamedQuery(name="commerce.findById", query="from Commerce where ID = :id")
public class Commerce implements Serializable {
	private static final long serialVersionUID = -6141852419517481059L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="NAME")
	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name="RETURN_PERIOD")
	private Date return_period;
	
	@Column(name="TEMPLATE")
	private String template;
	
	//TODO Hacer con enumerados
	@Column(name="TYPE")
	private Long type;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="country_fk",referencedColumnName="ID")
	private Country country;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="state_fk",referencedColumnName="ID")
	private State state;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="city_fk",referencedColumnName="ID")
	private City city;
	
	@OneToMany
    @JoinColumn(name="discount_fk",referencedColumnName="ID")
	private List<Discount> discounts;
	
	@OneToOne
    @JoinColumn(name="contract_fk",referencedColumnName="ID")
	private Contract contract;

	@Override
	public String toString() {
		return "Commerce [ID=" + id + ", name=" + name + ", return_period=" + return_period.getTime() + 
				", template=" + template + ", " + "type=" + type + "]";
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
	
	public Date getReturn_period() {
		return return_period;
	}

	public void setReturn_period(Date return_period) {
		this.return_period = return_period;
	}
	
	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public List<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
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
		
		Commerce other = (Commerce) obj;
		
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