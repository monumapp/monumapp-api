package com.monumapp.api.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Information {
	private String description;
	private List<OpenHours> openHours;
	private double enterPrice;
}
