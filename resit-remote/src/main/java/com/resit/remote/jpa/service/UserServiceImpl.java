/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.User;
import com.resit.remote.jpa.repository.UserRepository;

/**
 * Implementa el servicio que gestionará los objetos User.
 * Habilita la interacción entre el Controller y UserDao
 * 
 * @author aperalesb
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	 private UserRepository userRepository;
	 
	@Override
	@Transactional(readOnly=true)
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public void update(User user) {
		userRepository.save(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	@Transactional
	public void save(User user) {
		userRepository.save(user);
	}
}