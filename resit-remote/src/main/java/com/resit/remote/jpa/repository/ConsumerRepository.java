package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resit.remote.jpa.model.Consumer;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz ConsumerRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto Consumer.
 * @author aperalesb
 *
 */

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
	
	/**
	 * Obtiene el objeto Consumer en base al identificador.
	 * @param id - Identificador del usuario
	 * @return User que coincide con el identificador id, null en caso contrario
	 */
	Consumer findById(Long id);
}