/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Person;
import com.resit.remote.jpa.repository.PersonRepository;

/**
 * Implementa el servicio que gestionará los objetos Persona.
 * Habilita la interacción entre el Controller y PersonDao
 * Implements methods that enable interaction between 
 *
 * @author aperalesb
 *
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired
	 private PersonRepository personRepository;
	 
	/* (non-Javadoc)
	 * @see com.resit.remote.jpa.service.PersonService#findByEmplid(java.lang.String)
	 */
	@Override
	@Transactional(readOnly=true)
	public Person findByEmplid(Long emplid) {
		return personRepository.findByEmplid(emplid);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Person> findAllEmployees() {
		return personRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Person person) {
		personRepository.save(person);
	}

	@Override
	@Transactional
	public void delete(Person person) {
		personRepository.delete(person);
	}

	@Override
	@Transactional
	public void save(Person person) {
		personRepository.save(person);
	}
}