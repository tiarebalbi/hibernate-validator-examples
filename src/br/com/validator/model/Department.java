package br.com.validator.model;

import javax.validation.constraints.NotNull;

public class Department {

	@NotNull
	private String name;
	
	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
