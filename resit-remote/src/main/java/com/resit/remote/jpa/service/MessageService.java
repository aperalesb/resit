/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Message;

/**
 * Interfaz que define el servicio que gestionará objetos Message.
 * 
 * @author aperalesb
 *
 */
public interface MessageService {
	
	/**
	 * Obtiene el objeto Message en base al identificador.
	 * @param id - Identificador del mensaje
	 * @return Message que coincide con el identificador id, null en caso contrario
	 */
	public Message findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Message
	 * @return collection de objetos Message
	 */
	public List<Message> findAllMessages();
	
	/**
	 * Actualiza el objeto Message con el que se recibe por parámetro
	 *
	 * @param Message objeto Message
	 */
	public void update(Message message);
	
	/**
	 * Borra el objeto Message que se recibe por parámetro
	 * @param Message objeto Message
	 */
	public void delete(Message message);
	
	/**
	 * Guarda el objeto Message que se recibe por parámetro
	 * 
	 * @param Message objeto Message
	 */
	public void save(Message message); 
}