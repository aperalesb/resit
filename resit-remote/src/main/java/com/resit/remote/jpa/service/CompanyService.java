/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Company;

/**
 * Interfaz que define el servicio que gestionará objetos Company.
 * 
 * @author aperalesb
 *
 */
public interface CompanyService {
	
	/**
	 * Obtiene el objeto Company en base al identificador.
	 * @param id - Identificador del usuario
	 * @return Company que coincide con el identificador id, null en caso contrario
	 */
	public Company findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Company
	 * @return collection de objetos Company
	 */
	public List<Company> findAllCompanys();
	
	/**
	 * Actualiza el objeto Company con el que se recibe por parámetro
	 *
	 * @param Company objeto Company
	 */
	public void update(Company company);
	
	/**
	 * Borra el objeto Company que se recibe por parámetro
	 * @param Company objeto Company
	 */
	public void delete(Company company);
	
	/**
	 * Guarda el objeto Company que se recibe por parámetro
	 * 
	 * @param Company objeto Company
	 */
	public void save(Company company); 
}