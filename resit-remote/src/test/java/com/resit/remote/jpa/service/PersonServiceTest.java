package com.resit.remote.jpa.service;

import static org.junit.Assert.*;

import java.util.List;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Person;
import com.resit.remote.jpa.service.PersonService;

@ContextConfiguration(locations={"classpath:applicationContextTest.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class PersonServiceTest {
	private static final Logger logger = Logger.getLogger(PersonServiceTest.class.getName() );
	
	@Autowired
	PersonService personService;

	@Test
	public void testFindByEmplid() {
		Person person = personService.findByEmplid( new Long("1") );
		assertNotNull("Persona no puede ser null tras buscar el emplid 1", person);
		logger.info("Persona --> " + person);
	}
	
	@Test
	public void testFindByEmplidDoesNotExist() {
		Person person = personService.findByEmplid( new Long("100") );
		assertNull("Persona tiene que ser null tras buscar el emplid 100, que no existe.", person);
	}
	
	@Test
	public void testFindAllEmployees() {
		List<Person> employees = personService.findAllEmployees() ;
		assertEquals("El número de empleados tiene que ser 4 tras el inicio.", 4, employees.size() );
	}
	
	@Test
	public void testSaveEmployee() {
		Person person = new Person();
		person.setFirst_name("Resit");
		person.setLast_name("Testing");
		personService.save(person);
		List<Person> employees = personService.findAllEmployees() ;
		assertEquals("El número de empleados tiene que ser 5 tras guardar una persona a las 4 iniciales.", 5, employees.size() );
		logger.info("Person state is " + person);
	}
	
	@Test
	public void testUdate() {
	    Person person1 = new Person();
		person1.setEmplid(new Long("1"));
		person1.setFirst_name("Resit");
		person1.setLast_name("Testint");
		personService.update(person1);
		logger.info("El nombre de la Persona con emplid=1 se cambiará a Resit y el apellido a Testing");
		Person person = personService.findByEmplid( new Long("1") );
		assertEquals( "El nombre de la Persona actualizada no es Resit", "Resit", person.getFirst_name() );
		assertEquals( "El apellido de la Persona actualizada no es Testing", "Resit", person.getFirst_name() );
	}
	
	@Test
	public void testDelete() {
		Person person = personService.findByEmplid( new Long("4") );
		personService.delete(person);
		logger.info("Se borra la Persona con emplid=4");
		List<Person> employees = personService.findAllEmployees() ;
		assertEquals("El número de empleados tiene que ser 3 tras borrar una persona de las 4 iniciales.", 3, employees.size() );
		
	}
}