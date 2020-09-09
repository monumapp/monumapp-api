package com.monumapp.api.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class OpenHours {
	private List<String> days;
	private String open;
	private String close;
}
