package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resit.remote.jpa.model.Continent;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz ContinentRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto Continent.
 * @author aperalesb
 *
 */

public interface ContinentRepository extends JpaRepository<Continent, Long> {
	
	/**
	 * Obtiene el objeto Continent en base al identificador.
	 * @param id - Identificador del continente
	 * @return Continent que coincide con el identificador id, null en caso contrario
	 */
	Continent findById(Long id);
}