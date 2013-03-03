/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Contract;

/**
 * Interfaz que define el servicio que gestionará objetos Contract.
 * 
 * @author aperalesb
 *
 */
public interface ContractService {
	
	/**
	 * Obtiene el objeto Contract en base al identificador.
	 * @param id - Identificador del contrato
	 * @return Contract que coincide con el identificador id, null en caso contrario
	 */
	public Contract findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Contract
	 * @return collection de objetos Contract
	 */
	public List<Contract> findAllContracts();
	
	/**
	 * Actualiza el objeto Contract con el que se recibe por parámetro
	 *
	 * @param Contract objeto Contract
	 */
	public void update(Contract contract);
	
	/**
	 * Borra el objeto Contract que se recibe por parámetro
	 * @param Contract objeto Contract
	 */
	public void delete(Contract contract);
	
	/**
	 * Guarda el objeto Contract que se recibe por parámetro
	 * 
	 * @param Contract objeto Contract
	 */
	public void save(Contract contract); 
}