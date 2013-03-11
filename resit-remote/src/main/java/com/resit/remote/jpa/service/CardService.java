/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Card;

/**
 * Interfaz que define el servicio que gestionará objetos Card.
 * 
 * @author aperalesb
 *
 */
public interface CardService {
	
	/**
	 * Obtiene el objeto Card en base al identificador.
	 * @param id - Identificador de la tarjeta
	 * @return Card que coincide con el identificador id, null en caso contrario
	 */
	public Card findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Card
	 * @return collection de objetos Card
	 */
	public List<Card> findAllCards();
	
	/**
	 * Actualiza el objeto Card con el que se recibe por parámetro
	 *
	 * @param Card objeto Card
	 */
	public void update(Card card);
	
	/**
	 * Borra el objeto Card que se recibe por parámetro
	 * @param Card objeto Card
	 */
	public void delete(Card card);
	
	/**
	 * Guarda el objeto Card que se recibe por parámetro
	 * 
	 * @param Card objeto Card
	 */
	public void save(Card card); 
}