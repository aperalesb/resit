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
//import com.resit.remote.jpa.model.Alert;
//import com.resit.remote.jpa.repository.AlertRepository;
//
///**
// * Implementa el servicio que gestionará los objetos Alert.
// * Habilita la interacción entre el Controller y AlertDao
// * 
// * @author aperalesb
// *
// */
//
//@Repository
//@Transactional(readOnly = true)
//public class AlertServiceImpl implements AlertService {
//	@Autowired
//	 private AlertRepository alertRepository;
//	 
//	@Override
//	public Alert findById(Long id) {
//		return alertRepository.findById(id);
//	}
//
//	@Override
//	public List<Alert> findAllAlerts() {
//		return alertRepository.findAll();
//	}
//
//	@Override
//	@Transactional
//	public void update(Alert alert) {
//		alertRepository.save(alert);
//	}
//
//	@Override
//	@Transactional
//	public void delete(Alert alert) {
//		alertRepository.delete(alert);
//	}
//
//	@Override
//	@Transactional
//	public void save(Alert alert) {
//		alertRepository.save(alert);
//	}
//}