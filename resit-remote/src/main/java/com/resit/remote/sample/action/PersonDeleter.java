/**
 * 
 */
package com.resit.remote.sample.action;

import com.opensymphony.xwork2.ActionSupport;
import com.resit.remote.jpa.model.Person;
import com.resit.remote.jpa.service.PersonService;

/**
 * Acts as the controller for handling user
 * requests to delete a Person object.
 * @author aperalesb
 *
 */
public class PersonDeleter extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private  transient PersonService personService;
	private Person person ;
	private Long emplid ;
	
	/**
	 * Use emplid provided in the user's 
	 * request to find the Person 
	 * object and then delete that Person's
	 * record.
	 */
	public String execute() throws Exception {
		person = personService.findByEmplid(emplid);
		personService.delete(person); 
		return SUCCESS;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Long getEmplid() {
		return emplid;
	}

	public void setEmplid(Long emplid) {
		this.emplid = emplid;
	}
}