package com.resit.remote.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resit.remote.jpa.model.Discount;

/**
 * Utilizamos la librería Spring Data JPA para definir
 * la interfaz DiscountRepository.
 * El objeto Bean será creado por Spring con soporte
 * CRUD para un objeto Discount.
 * @author aperalesb
 *
 */

public interface DiscountRepository extends JpaRepository<Discount, Long> {
	
	/**
	 * Obtiene el objeto Discount en base al identificador.
	 * @param id - Identificador del descuento
	 * @return Discount que coincide con el identificador id, null en caso contrario
	 */
	Discount findById(Long id);
}