/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Discount;
import com.resit.remote.jpa.repository.DiscountRepository;

/**
 * Implementa el servicio que gestionará los objetos Discount.
 * Habilita la interacción entre el Controller y DiscountDao
 * 
 * @author aperalesb
 *
 */
@Repository
@Transactional(readOnly = true)
public class DiscountServiceImpl implements DiscountService {
	@Autowired
	 private DiscountRepository discountRepository;
	 
	@Override
	public Discount findById(Long id) {
		return discountRepository.findById(id);
	}

	@Override
	public List<Discount> findAllDiscounts() {
		return discountRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Discount discount) {
		discountRepository.save(discount);
	}

	@Override
	@Transactional
	public void delete(Discount discount) {
		discountRepository.delete(discount);
	}

	@Override
	@Transactional
	public void save(Discount discount) {
		discountRepository.save(discount);
	}
}