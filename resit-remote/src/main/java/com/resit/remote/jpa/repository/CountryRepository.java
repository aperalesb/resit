//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.Country;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz CountryRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto Country.
// * @author aperalesb
// *
// */
//
//public interface CountryRepository extends JpaRepository<Country, Long> {
//	
//	/**
//	 * Obtiene el objeto Country en base al identificador.
//	 * @param id - Identificador del país
//	 * @return Country que coincide con el identificador id, null en caso contrario
//	 */
//	Country findById(Long id);
//}