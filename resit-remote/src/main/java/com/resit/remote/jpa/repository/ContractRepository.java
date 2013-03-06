//package com.resit.remote.jpa.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.resit.remote.jpa.model.Contract;
//
///**
// * Utilizamos la librería Spring Data JPA para definir
// * la interfaz ContractRepository.
// * El objeto Bean será creado por Spring con soporte
// * CRUD para un objeto Contract.
// * @author aperalesb
// *
// */
//
//public interface ContractRepository extends JpaRepository<Contract, Long> {
//	
//	/**
//	 * Obtiene el objeto Contract en base al identificador.
//	 * @param id - Identificador del contrato
//	 * @return Contract que coincide con el identificador id, null en caso contrario
//	 */
//	Contract findById(Long id);
//}