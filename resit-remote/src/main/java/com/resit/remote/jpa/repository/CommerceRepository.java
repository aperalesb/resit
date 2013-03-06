package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resit.remote.jpa.model.Commerce;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz UserRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto User.
 * @author aperalesb
 *
 */

public interface CommerceRepository extends JpaRepository<Commerce, Long> {
	
	/**
	 * Obtiene el objeto User en base al identificador.
	 * @param id - Identificador del comercio
	 * @return User que coincide con el identificador id, null en caso contrario
	 */
	Commerce findById(Long id);
}