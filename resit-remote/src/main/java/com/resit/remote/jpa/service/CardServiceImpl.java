/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Card;
import com.resit.remote.jpa.repository.CardRepository;

/**
 * Implementa el servicio que gestionará los objetos Card.
 * Habilita la interacción entre el Controller y CardDao
 * 
 * @author aperalesb
 *
 */
@Service("cardService")
public class CardServiceImpl implements CardService {
	@Autowired
	 private CardRepository cardRepository;
	 
	@Override
	@Transactional(readOnly=true)
	public Card findById(Long id) {
		return cardRepository.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Card> findAllCards() {
		return cardRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Card card) {
		cardRepository.save(card);
	}

	@Override
	@Transactional
	public void delete(Card card) {
		cardRepository.delete(card);
	}

	@Override
	@Transactional
	public void save(Card card) {
		cardRepository.save(card);
	}
}