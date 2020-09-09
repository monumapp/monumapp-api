package com.monumapp.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monumapp.api.models.Monument;
import com.monumapp.api.repositories.MonumentRepository;

@Service
public class SearchMonumentByIdService {
	@Autowired
	private MonumentRepository monumentRepository;
	
	public Monument execute(String id) throws Exception {
		
		Optional<Monument> monument = monumentRepository.findById(id);
		
		return monument.orElseThrow(() -> new Exception("Objeto não encontrado"));
	}
}
