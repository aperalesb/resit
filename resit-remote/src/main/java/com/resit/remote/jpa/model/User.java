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
 * Modelo del objeto Usuario.
 * @author aperalesb
 *
 */
@Entity
@Table(name="users")
@NamedQuery(name="users.findByUserId", query="from Users where ID_CON = :id")
public class User extends AbstractPersistable<Long> implements Serializable  {
	private static final long serialVersionUID = 3697535594187479699L;
	@Id
	@Column(name="ID_CON")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="NAME")
	private String name;
	@Column(name="SURMNAME")
	private String surname;
	@Column(name="IDENTIFICATION")
	private String identification;
	@Column(name="SEX")
	private String sex;
	@Column(name="AGE")
	private Integer age;
	
	@Override
	public String toString() {
		return "User [ID_CON=" + id + ", name=" + name + ", surname=" + surname + ", " +
				"identification=" + identification + ", sex=" + sex + ", age=" + age + "]";
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id_con) {
		this.id = id_con;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result	+ ((name == null) ? 0 : name.hashCode());
		result = prime * result	+ ((surname == null) ? 0 : surname.hashCode());
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
		
		User other = (User) obj;
		
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
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		
		return true;
	}
}