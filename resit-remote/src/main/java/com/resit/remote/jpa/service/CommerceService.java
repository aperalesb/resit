/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Commerce;

/**
 * Interfaz que define el servicio que gestionará objetos Commerce.
 * 
 * @author aperalesb
 *
 */
public interface CommerceService {
	
	/**
	 * Obtiene el objeto Commerce en base al identificador.
	 * @param id - Identificador del comercio
	 * @return Commerce que coincide con el identificador id, null en caso contrario
	 */
	public Commerce findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Commerce
	 * @return collection de objetos Commerce
	 */
	public List<Commerce> findAllCommerces();
	
	/**
	 * Actualiza el objeto Commerce con el que se recibe por parámetro
	 *
	 * @param Commerce objeto Commerce
	 */
	public void update(Commerce commerce);
	
	/**
	 * Borra el objeto Commerce que se recibe por parámetro
	 * @param Commerce objeto Commerce
	 */
	public void delete(Commerce commerce);
	
	/**
	 * Guarda el objeto Commerce que se recibe por parámetro
	 * 
	 * @param Commerce objeto Commerce
	 */
	public void save(Commerce commerce); 
}