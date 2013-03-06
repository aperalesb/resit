//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.Alert;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz AlertRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto Alert.
// * @author aperalesb
// *
// */
//
//public interface AlertRepository extends JpaRepository<Alert, Long> {
//	
//	/**
//	 * Obtiene el objeto Alert en base al identificador.
//	 * @param id - Identificador de la alerta
//	 * @return User que coincide con el identificador id, null en caso contrario
//	 */
//	Alert findById(Long id);
//}