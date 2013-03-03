/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Consumer;

/**
 * Interfaz que define el servicio que gestionará objetos Consumer.
 * 
 * @author aperalesb
 *
 */
public interface ConsumerService {
	
	/**
	 * Obtiene el objeto Consumer en base al identificador.
	 * @param id - Identificador del usuario
	 * @return Consumer que coincide con el identificador id, null en caso contrario
	 */
	public Consumer findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Consumer
	 * @return collection de objetos Consumer
	 */
	public List<Consumer> findAllConsumers();
	
	/**
	 * Actualiza el objeto Consumer con el que se recibe por parámetro
	 *
	 * @param commerce objeto Consumer
	 */
	public void update(Consumer commerce);
	
	/**
	 * Borra el objeto Consumer que se recibe por parámetro
	 * @param commerce objeto Consumer
	 */
	public void delete(Consumer commerce);
	
	/**
	 * Guarda el objeto Consumer que se recibe por parámetro
	 * 
	 * @param commerce objeto Consumer
	 */
	public void save(Consumer commerce); 
}