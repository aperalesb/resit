/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Country;

/**
 * Interfaz que define el servicio que gestionará objetos Country.
 * 
 * @author aperalesb
 *
 */
public interface CountryService {
	
	/**
	 * Obtiene el objeto Country en base al identificador.
	 * @param id - Identificador del País
	 * @return Country que coincide con el identificador id, null en caso contrario
	 */
	public Country findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Country
	 * @return collection de objetos Country
	 */
	public List<Country> findAllCountrys();
	
	/**
	 * Actualiza el objeto Country con el que se recibe por parámetro
	 *
	 * @param Country objeto Country
	 */
	public void update(Country country);
	
	/**
	 * Borra el objeto Country que se recibe por parámetro
	 * @param Country objeto Country
	 */
	public void delete(Country country);
	
	/**
	 * Guarda el objeto Country que se recibe por parámetro
	 * 
	 * @param Country objeto Country
	 */
	public void save(Country country); 
}