/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Continent;
import com.resit.remote.jpa.repository.ContinentRepository;

/**
 * Implementa el servicio que gestionará los objetos Continent.
 * Habilita la interacción entre el Controller y ContinentDao
 * 
 * @author aperalesb
 *
 */
@Repository
@Transactional(readOnly = true)
public class ContinentServiceImpl implements ContinentService {
	@Autowired
	 private ContinentRepository continentRepository;
	 
	@Override
	public Continent findById(Long id) {
		return continentRepository.findById(id);
	}

	@Override
	public List<Continent> findAllContinents() {
		return continentRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Continent continent) {
		continentRepository.save(continent);
	}

	@Override
	@Transactional
	public void delete(Continent continent) {
		continentRepository.delete(continent);
	}

	@Override
	@Transactional
	public void save(Continent continent) {
		continentRepository.save(continent);
	}
}