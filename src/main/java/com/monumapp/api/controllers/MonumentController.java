package com.monumapp.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.monumapp.api.models.Monument;
import com.monumapp.api.services.ListAllMonumentsService;
import com.monumapp.api.services.SearchMonumentByIdService;

@Controller
public class MonumentController {
	@Autowired
	SearchMonumentByIdService searchMonumentByIdService;
	
	@Autowired
	ListAllMonumentsService listAllMonumentsService;
	
	public List<Monument> index() throws Exception{
		return listAllMonumentsService.execute();
	}
	
	public Monument show(String id) throws Exception{
		return searchMonumentByIdService.execute(id);
	}
}
