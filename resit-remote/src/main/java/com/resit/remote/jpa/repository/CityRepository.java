//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.City;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz CityRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto City.
// * @author aperalesb
// *
// */
//
//public interface CityRepository extends JpaRepository<City, Long> {
//	
//	/**
//	 * Obtiene el objeto City en base al identificador.
//	 * @param id - Identificador de la ciudad
//	 * @return City que coincide con el identificador id, null en caso contrario
//	 */
//	City findById(Long id);
//}