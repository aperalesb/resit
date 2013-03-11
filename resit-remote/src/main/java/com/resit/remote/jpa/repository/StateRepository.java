package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resit.remote.jpa.model.State;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz StateRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto State.
 * @author aperalesb
 *
 */

public interface StateRepository extends JpaRepository<State, Long> {
	
	/**
	 * Obtiene el objeto State en base al identificador.
	 * @param id - Identificador del estado o provincia
	 * @return State que coincide con el identificador id, null en caso contrario
	 */
	State findById(Long id);
}