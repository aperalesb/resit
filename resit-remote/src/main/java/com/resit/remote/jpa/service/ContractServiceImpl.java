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
//import com.resit.remote.jpa.model.Contract;
//import com.resit.remote.jpa.repository.ContractRepository;
//
///**
// * Implementa el servicio que gestionará los objetos Contract.
// * Habilita la interacción entre el Controller y ContractDao
// * 
// * @author aperalesb
// *
// */
//@Repository
//@Transactional(readOnly = true)
//public class ContractServiceImpl implements ContractService {
//	@Autowired
//	 private ContractRepository contractRepository;
//	 
//	@Override
//	public Contract findById(Long id) {
//		return contractRepository.findById(id);
//	}
//
//	@Override
//	public List<Contract> findAllContracts() {
//		return contractRepository.findAll();
//	}
//
//	@Override
//	@Transactional
//	public void update(Contract contract) {
//		contractRepository.save(contract);
//	}
//
//	@Override
//	@Transactional
//	public void delete(Contract contract) {
//		contractRepository.delete(contract);
//	}
//
//	@Override
//	@Transactional
//	public void save(Contract contract) {
//		contractRepository.save(contract);
//	}
//}