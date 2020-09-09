package com.monumapp.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.monumapp.api.models.Monument;
import com.monumapp.api.services.SearchMonumentByIdService;

@Controller
public class MonumentController {
	@Autowired
	SearchMonumentByIdService searchMonumentByIdService;
	
	public Monument show(String id) throws Exception{
		return searchMonumentByIdService.execute(id);
	}
}
