/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import com.resit.remote.jpa.model.Discount;

/**
 * Interfaz que define el servicio que gestionará objetos Discount.
 * 
 * @author aperalesb
 *
 */
public interface DiscountService {
	
	/**
	 * Obtiene el objeto Discount en base al identificador.
	 * @param id - Identificador del descuento
	 * @return Discount que coincide con el identificador id, null en caso contrario
	 */
	public Discount findById(Long id);
	
	/**
	 * Obtiene la lista completa de objetos Discount
	 * @return collection de objetos Discount
	 */
	public List<Discount> findAllDiscounts();
	
	/**
	 * Actualiza el objeto Discount con el que se recibe por parámetro
	 *
	 * @param Discount objeto Discount
	 */
	public void update(Discount discount);
	
	/**
	 * Borra el objeto Discount que se recibe por parámetro
	 * @param Discount objeto Discount
	 */
	public void delete(Discount discount);
	
	/**
	 * Guarda el objeto Discount que se recibe por parámetro
	 * 
	 * @param Discount objeto Discount
	 */
	public void save(Discount discount); 
}