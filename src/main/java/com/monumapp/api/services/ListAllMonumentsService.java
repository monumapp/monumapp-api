package com.monumapp.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monumapp.api.models.Monument;
import com.monumapp.api.repositories.MonumentRepository;

@Service
public class ListAllMonumentsService {
	@Autowired
	private MonumentRepository monumentRepository;
	
	public List<Monument> execute() throws Exception {
		
		List<Monument> monuments = monumentRepository.findAll();
		
		return monuments;
	}
}
