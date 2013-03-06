//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.Message;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz MessageRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto Message.
// * @author aperalesb
// *
// */
//
//public interface MessageRepository extends JpaRepository<Message, Long> {
//	
//	/**
//	 * Obtiene el objeto Message en base al identificador.
//	 * @param id - Identificador del mensaje
//	 * @return Message que coincide con el identificador id, null en caso contrario
//	 */
//	Message findById(Long id);
//}