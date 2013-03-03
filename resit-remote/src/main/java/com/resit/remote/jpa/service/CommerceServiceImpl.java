/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Commerce;
import com.resit.remote.jpa.repository.CommerceRepository;

/**
 * Implementa el servicio que gestionará los objetos Commerce.
 * Habilita la interacción entre el Controller y CommerceDao
 * 
 * @author aperalesb
 *
 */
@Service("commerceService")
public class CommerceServiceImpl implements CommerceService {
	@Autowired
	 private CommerceRepository commerceRepository;
	 
	@Override
	@Transactional(readOnly=true)
	public Commerce findById(Long id) {
		return commerceRepository.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Commerce> findAllCommerces() {
		return commerceRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Commerce commerce) {
		commerceRepository.save(commerce);
	}

	@Override
	@Transactional
	public void delete(Commerce commerce) {
		commerceRepository.delete(commerce);
	}

	@Override
	@Transactional
	public void save(Commerce commerce) {
		commerceRepository.save(commerce);
	}
}