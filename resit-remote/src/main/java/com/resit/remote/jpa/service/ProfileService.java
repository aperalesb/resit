/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Profile;

/**
 * Interfaz que define el servicio que gestionará objetos Profile.
 * 
 * @author aperalesb
 *
 */
public interface ProfileService {
	
	/**
	 * Obtiene el objeto Profile en base al identificador.
	 * @param id - Identificador del perfil de usuario
	 * @return Profile que coincide con el identificador id, null en caso contrario
	 */
	public Profile findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Profile
	 * @return collection de objetos Profile
	 */
	public List<Profile> findAllProfiles();
	
	/**
	 * Actualiza el objeto Profile con el que se recibe por parámetro
	 *
	 * @param Profile objeto Profile
	 */
	public void update(Profile profile);
	
	/**
	 * Borra el objeto Profile que se recibe por parámetro
	 * @param Profile objeto Profile
	 */
	public void delete(Profile profile);
	
	/**
	 * Guarda el objeto Profile que se recibe por parámetro
	 * 
	 * @param Profile objeto Profile
	 */
	public void save(Profile profile); 
}