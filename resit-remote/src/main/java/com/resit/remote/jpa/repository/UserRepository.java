package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.resit.remote.jpa.model.User;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz UserRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto User.
 * @author aperalesb
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {
	
	/**
	 * Obtiene el objeto User en base al identificador.
	 * @param id - Identificador del usuario
	 * @return User que coincide con el identificador id, null en caso contrario
	 */
	User findById(Long id);
}