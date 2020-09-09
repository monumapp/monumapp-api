package com.monumapp.api.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Document
public class Monument implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String name;
	
	private List<String> imagesUrls;
	
	private String neighborhood;
	
	private Information information;
	
	private History history;

	public Monument(
		String name, 
		List<String> imagesUrls, 
		String neighborhood, 
		String description,
		List<OpenHours> openHours,
		double enterPrice,
		String foundationDate,
		String origin,
		String importantFacts
	) {
		this.name = name;
		this.imagesUrls = imagesUrls;
		this.neighborhood = neighborhood;
		this.information = new Information(description, openHours, enterPrice);
		this.history = new History(foundationDate, origin, importantFacts);
	}
	
	
}
