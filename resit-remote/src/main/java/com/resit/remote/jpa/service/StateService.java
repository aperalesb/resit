/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.State;

/**
 * Interfaz que define el servicio que gestionará objetos State.
 * 
 * @author aperalesb
 *
 */
public interface StateService {
	
	/**
	 * Obtiene el objeto State en base al identificador.
	 * @param id - Identificador del Estado o Provincia
	 * @return State que coincide con el identificador id, null en caso contrario
	 */
	public State findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos State
	 * @return collection de objetos State
	 */
	public List<State> findAllStates();
	
	/**
	 * Actualiza el objeto State con el que se recibe por parámetro
	 *
	 * @param State objeto State
	 */
	public void update(State state);
	
	/**
	 * Borra el objeto State que se recibe por parámetro
	 * @param State objeto State
	 */
	public void delete(State state);
	
	/**
	 * Guarda el objeto State que se recibe por parámetro
	 * 
	 * @param State objeto State
	 */
	public void save(State state); 
}