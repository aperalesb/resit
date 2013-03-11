/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.City;

/**
 * Interfaz que define el servicio que gestionará objetos City.
 * 
 * @author aperalesb
 *
 */
public interface CityService {
	
	/**
	 * Obtiene el objeto City en base al identificador.
	 * @param id - Identificador de la Ciudad o Pueblo
	 * @return City que coincide con el identificador id, null en caso contrario
	 */
	public City findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos City
	 * @return collection de objetos City
	 */
	public List<City> findAllCitys();
	
	/**
	 * Actualiza el objeto City con el que se recibe por parámetro
	 *
	 * @param City objeto City
	 */
	public void update(City city);
	
	/**
	 * Borra el objeto City que se recibe por parámetro
	 * @param City objeto City
	 */
	public void delete(City city);
	
	/**
	 * Guarda el objeto City que se recibe por parámetro
	 * 
	 * @param City objeto City
	 */
	public void save(City city); 
}