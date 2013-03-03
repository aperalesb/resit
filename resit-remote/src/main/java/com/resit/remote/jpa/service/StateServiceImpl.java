/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.State;
import com.resit.remote.jpa.repository.StateRepository;

/**
 * Implementa el servicio que gestionará los objetos State.
 * Habilita la interacción entre el Controller y StateDao
 * 
 * @author aperalesb
 *
 */
@Service("stateService")
public class StateServiceImpl implements StateService {
	@Autowired
	 private StateRepository stateRepository;
	 
	@Override
	@Transactional(readOnly=true)
	public State findById(Long id) {
		return stateRepository.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<State> findAllStates() {
		return stateRepository.findAll();
	}

	@Override
	@Transactional
	public void update(State state) {
		stateRepository.save(state);
	}

	@Override
	@Transactional
	public void delete(State state) {
		stateRepository.delete(state);
	}

	@Override
	@Transactional
	public void save(State state) {
		stateRepository.save(state);
	}
}