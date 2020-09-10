package com.monumapp.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monumapp.api.models.Monument;
import com.monumapp.api.repositories.MonumentRepository;

@Service
public class SearchMonumentByNameService {
	@Autowired
	private MonumentRepository monumentRepository;
	
	public List<Monument> execute(String name) throws Exception {
		
		List<Monument> monument = monumentRepository.findByNameLike(name);
		
		return monument;
	}
}
