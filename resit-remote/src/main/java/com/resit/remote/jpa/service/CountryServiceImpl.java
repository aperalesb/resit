///**
// * 
// */
//package com.resit.remote.jpa.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.resit.remote.jpa.model.Country;
//import com.resit.remote.jpa.repository.CountryRepository;
//
///**
// * Implementa el servicio que gestionará los objetos Country.
// * Habilita la interacción entre el Controller y CountryDao
// * 
// * @author aperalesb
// *
// */
//@Repository
//@Transactional(readOnly = true)
//public class CountryServiceImpl implements CountryService {
//	@Autowired
//	 private CountryRepository countryRepository;
//	 
//	@Override
//	public Country findById(Long id) {
//		return countryRepository.findById(id);
//	}
//
//	@Override
//	public List<Country> findAllCountrys() {
//		return countryRepository.findAll();
//	}
//
//	@Override
//	@Transactional
//	public void update(Country country) {
//		countryRepository.save(country);
//	}
//
//	@Override
//	@Transactional
//	public void delete(Country country) {
//		countryRepository.delete(country);
//	}
//
//	@Override
//	@Transactional
//	public void save(Country country) {
//		countryRepository.save(country);
//	}
//}