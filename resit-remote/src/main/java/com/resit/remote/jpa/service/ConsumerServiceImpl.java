///**
// * 
// */
//package com.resit.remote.jpa.service;
//
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.resit.remote.jpa.model.Consumer;
//import com.resit.remote.jpa.repository.ConsumerRepository;
//
///**
// * Implementa el servicio que gestionará los objetos Consumer.
// * Habilita la interacción entre el Controller y ConsumerDao
// * 
// * @author aperalesb
// *
// */
//@Repository
//@Transactional(readOnly = true)
//public class ConsumerServiceImpl implements ConsumerService {
//	@Autowired
//	 private ConsumerRepository consumerRepository;
//	 
//	@Override
//	public Consumer findById(Long id) {
//		return consumerRepository.findById(id);
//	}
//
//	@Override
//	public List<Consumer> findAllConsumers() {
//		return consumerRepository.findAll();
//	}
//
//	@Override
//	@Transactional
//	public void update(Consumer consumer) {
//		consumerRepository.save(consumer);
//	}
//
//	@Override
//	@Transactional
//	public void delete(Consumer consumer) {
//		consumerRepository.delete(consumer);
//	}
//
//	@Override
//	@Transactional
//	public void save(Consumer consumer) {
//		consumerRepository.save(consumer);
//	}
//}