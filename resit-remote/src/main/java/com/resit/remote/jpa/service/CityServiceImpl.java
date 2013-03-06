/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.City;
import com.resit.remote.jpa.repository.CityRepository;

/**
 * Implementa el servicio que gestionará los objetos City.
 * Habilita la interacción entre el Controller y CityDao
 * 
 * @author aperalesb
 *
 */
@Repository
@Transactional(readOnly = true)
public class CityServiceImpl implements CityService {
	@Autowired
	 private CityRepository cityRepository;
	 
	@Override
	public City findById(Long id) {
		return cityRepository.findById(id);
	}

	@Override
	public List<City> findAllCitys() {
		return cityRepository.findAll();
	}

	@Override
	@Transactional
	public void update(City city) {
		cityRepository.save(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		cityRepository.delete(city);
	}

	@Override
	@Transactional
	public void save(City city) {
		cityRepository.save(city);
	}
}