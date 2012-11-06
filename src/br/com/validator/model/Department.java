package br.com.validator.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Department {

	@NotNull
	private String name;
	
	@NotNull
	@Size(min=5, max=30)
	private String description;
	
	@Valid
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Department(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
