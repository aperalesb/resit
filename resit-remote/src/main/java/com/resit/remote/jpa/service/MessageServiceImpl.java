/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Message;
import com.resit.remote.jpa.repository.MessageRepository;

/**
 * Implementa el servicio que gestionará los objetos Message.
 * Habilita la interacción entre el Controller y MessageDao
 * 
 * @author aperalesb
 *
 */
@Repository
@Transactional(readOnly = true)
public class MessageServiceImpl implements MessageService {
	@Autowired
	 private MessageRepository messageRepository;
	 
	@Override
	public Message findById(Long id) {
		return messageRepository.findById(id);
	}

	@Override
	public List<Message> findAllMessages() {
		return messageRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Message message) {
		messageRepository.save(message);
	}

	@Override
	@Transactional
	public void delete(Message message) {
		messageRepository.delete(message);
	}

	@Override
	@Transactional
	public void save(Message message) {
		messageRepository.save(message);
	}
}