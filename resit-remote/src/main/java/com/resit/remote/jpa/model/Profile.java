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
 * Modelo del objeto Perfil de usuario.
 * @author aperalesb
 *
 */
@Entity
@Table(name="profile")
//@NamedQuery(name="profile.findById", query="from Profile where ID = :id")
public class Profile implements Serializable {
	private static final long serialVersionUID = 4161692985463817989L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SURNAME")
	private String surname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="SEX")
	private String sex;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="PHONE")
	private Long phone;
	
	@Column(name="LOCATION")
	private String location;

	@Temporal(TemporalType.DATE)
	@Column(name="SINGUP")
	private Date singup;

	@Temporal(TemporalType.DATE)
	@Column(name="SINGOFF")
	private Date singoff;
	
	@Override
	public String toString() {
		return "User [ID=" + id + ", name=" + name + ", surname=" + surname + 
				", email=" + email + ", sex=" + sex + ", age=" + age + 
				", phone=" + phone + ", location=" + location + 
				", singup=" + singup.getTime()  + ", singoff=" + singoff.getTime() + "]";
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
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getSingup() {
		return singup;
	}

	public void setSingup(Date singup) {
		this.singup = singup;
	}

	public Date getSingoff() {
		return singoff;
	}

	public void setSingoff(Date singoff) {
		this.singoff = singoff;
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
		
		Profile other = (Profile) obj;
		
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