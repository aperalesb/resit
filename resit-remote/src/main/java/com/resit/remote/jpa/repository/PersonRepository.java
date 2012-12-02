package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.resit.remote.jpa.model.Person;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz PersonRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto Persona.
 * @author aperalesb
 *
 */

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	/**
	 * Obtiene el objeto Persona en base al identificador.
	 * @param emplid - Identificador de la Persona
	 * @return Person que coincide con el identificador emplid, null en caso contrario
	 */
	Person findByEmplid(Long emplid);
}