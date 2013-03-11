/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Alert;

/**
 * Interfaz que define el servicio que gestionará objetos Alert.
 * 
 * @author aperalesb
 *
 */
public interface AlertService {
	
	/**
	 * Obtiene el objeto Alert en base al identificador.
	 * @param id - Identificador de la alerta
	 * @return Alert que coincide con el identificador id, null en caso contrario
	 */
	public Alert findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Alert
	 * @return collection de objetos Alert
	 */
	public List<Alert> findAllAlerts();
	
	/**
	 * Actualiza el objeto Alert con el que se recibe por parámetro
	 *
	 * @param Alert objeto Alert
	 */
	public void update(Alert alert);
	
	/**
	 * Borra el objeto Alert que se recibe por parámetro
	 * @param Alert objeto Alert
	 */
	public void delete(Alert alert);
	
	/**
	 * Guarda el objeto Alert que se recibe por parámetro
	 * 
	 * @param Alert objeto Alert
	 */
	public void save(Alert alert); 
}