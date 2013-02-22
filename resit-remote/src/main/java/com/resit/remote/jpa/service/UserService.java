/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.User;

/**
 * Interfaz que define el servicio que gestionará objetos User.
 * 
 * @author aperalesb
 *
 */
public interface UserService {
	
	/**
	 * Obtiene el objeto User en base al identificador.
	 * @param id - Identificador del usuario
	 * @return User que coincide con el identificador id, null en caso contrario
	 */
	public User findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos User
	 * @return collection de objetos User
	 */
	public List<User> findAllUsers();
	
	/**
	 * Actualiza el objeto User con el que se recibe por parámetro
	 *
	 * @param user objeto User
	 */
	public void update(User user);
	
	/**
	 * Borra el objeto User que se recibe por parámetro
	 * @param user objeto User
	 */
	public void delete(User user);
	
	/**
	 * Guarda el objeto User que se recibe por parámetro
	 * 
	 * @param user objeto User
	 */
	public void save(User user); 
}