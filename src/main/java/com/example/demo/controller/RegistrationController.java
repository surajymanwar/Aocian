package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Registration;
import com.example.demo.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	@GetMapping("/getAll")
	public ResponseEntity<List<Registration>> getAll() {
		List<Registration> list = registrationService.getRegistrstion();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/getMan")
	public ResponseEntity<List<Registration>> getMan() {
		List<Registration> l1 = registrationService.getMan();
		return ResponseEntity.ok().body(l1);
	}

	public ResponseEntity<List<Registration>> getGirl() {
		List<Registration> l2 = registrationService.getGirl();
		return ResponseEntity.ok().body(l2);
	}
}
