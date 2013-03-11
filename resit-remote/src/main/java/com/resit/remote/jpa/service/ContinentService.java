/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Continent;

/**
 * Interfaz que define el servicio que gestionará objetos Continent.
 * 
 * @author aperalesb
 * 
 */
public interface ContinentService {
	
	/**
	 * Obtiene el objeto Continent en base al identificador.
	 * @param id - Identificador del Continente
	 * @return Continent que coincide con el identificador id, null en caso contrario
	 */
	public Continent findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Continent
	 * @return collection de objetos Continent
	 */
	public List<Continent> findAllContinents();
	
	/**
	 * Actualiza el objeto Continent con el que se recibe por parámetro
	 *
	 * @param Continent objeto Continent
	 */
	public void update(Continent continent);
	
	/**
	 * Borra el objeto Continent que se recibe por parámetro
	 * @param Continent objeto Continent
	 */
	public void delete(Continent continent);
	
	/**
	 * Guarda el objeto Continent que se recibe por parámetro
	 * 
	 * @param Continent objeto Continent
	 */
	public void save(Continent continent); 
}