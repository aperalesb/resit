//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.Profile;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz ProfileRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto Profile.
// * @author aperalesb
// *
// */
//
//public interface ProfileRepository extends JpaRepository<Profile, Long> {
//	
//	/**
//	 * Obtiene el objeto Profile en base al identificador.
//	 * @param id - Identificador del perfil
//	 * @return Profile que coincide con el identificador id, null en caso contrario
//	 */
//	Profile findById(Long id);
//}