package com.monumapp.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.monumapp.api.models.Monument;
import com.monumapp.api.services.SearchMonumentByNameService;

@Controller
public class SearchController {
	
	@Autowired
	SearchMonumentByNameService searchMonumentByNameService;
	
	public List<Monument> show(String monumentName) throws Exception{
		return searchMonumentByNameService.execute(monumentName);
	}
}
