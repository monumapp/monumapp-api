package com.monumapp.api.routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monumapp.api.controllers.MonumentController;
import com.monumapp.api.models.Monument;

@RestController
@RequestMapping(value = "/monuments")
public class MonumentRoutes {
	
	@Autowired
	MonumentController monumentsController;
	
	@GetMapping("/{monument_id}")
	public Monument findMonumentById(@PathVariable String monument_id) throws Exception {
		return monumentsController.show(monument_id);
	}
	
	@GetMapping
	public List<Monument> findMonumentByName() throws Exception {
		return monumentsController.index();
	}
}
