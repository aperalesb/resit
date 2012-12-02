/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Person;

/**
 * Interfaz que define el servicio que gestionará objetos Persona.
 * 
 * @author aperalesb
 *
 */
public interface PersonService {
	
	/**
	 * Obtiene el objeto Persona en base al identificador.
	 * @param emplid - Identificador de la Persona
	 * @return Person que coincide con el identificador emplid, null en caso contrario
	 */
	public Person findByEmplid(Long emplid);
	
	/**
	 * Obtiene la lista completa de objetos Persona
	 * @return collection de objetos Persona
	 */
	public List<Person> findAllEmployees();
	
	/**
	 * Actualiza el objeto Persona con el que se recibe por parámetro
	 *
	 * @param person objeto Persona
	 */
	public void update(Person person);
	
	/**
	 * Borra el objeto Persona que se recibe por parámetro
	 * @param person objeto Persona
	 */
	public void delete(Person person);
	
	/**
	 * Guarda el objeto Persona que se recibe por parámetro
	 * 
	 * @param person objeto Persona
	 */
	public void save(Person person); 
}