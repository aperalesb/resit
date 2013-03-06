//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.Card;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz CardRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto Card.
// * @author aperalesb
// *
// */
//
//public interface CardRepository extends JpaRepository<Card, Long> {
//	
//	/**
//	 * Obtiene el objeto Card en base al identificador.
//	 * @param id - Identificador de la tarjeta
//	 * @return Card que coincide con el identificador id, null en caso contrario
//	 */
//	Card findById(Long id);
//}