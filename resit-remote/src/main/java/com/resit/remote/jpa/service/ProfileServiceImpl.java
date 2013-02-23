/**
 * 
 */
package com.resit.remote.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resit.remote.jpa.model.Profile;
import com.resit.remote.jpa.repository.ProfileRepository;

/**
 * Implementa el servicio que gestionará los objetos Profile.
 * Habilita la interacción entre el Controller y ProfileDao
 * 
 * @author aperalesb
 *
 */
@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	 private ProfileRepository profileRepository;
	 
	@Override
	@Transactional(readOnly=true)
	public Profile findById(Long id) {
		return profileRepository.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Profile> findAllProfiles() {
		return profileRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Profile profile) {
		profileRepository.save(profile);
	}

	@Override
	@Transactional
	public void delete(Profile profile) {
		profileRepository.delete(profile);
	}

	@Override
	@Transactional
	public void save(Profile profile) {
		profileRepository.save(profile);
	}
}