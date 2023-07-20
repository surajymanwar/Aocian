package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

	@Override
	public List<Registration> getRegistrstion() {
		List<Registration> list = new ArrayList<Registration>();
		registrationRepository.findAll().forEach(r -> list.add(r));
		return list;
	}

	@Override
	public List<Registration> getMan() {
		List<Registration> list1 = new ArrayList<Registration>();
		registrationRepository.findAll().forEach(man -> list1.add(man));
		return list1;
	}

	@Override
	public List<Registration> getGirl() {
		List<Registration> list2 = new ArrayList<Registration>();
		registrationRepository.findAll().forEach(girl -> list2.add(girl));
		return list2;
	}

}
