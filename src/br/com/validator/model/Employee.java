package br.com.validator.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Employee {

	@NotNull
	private String name;
	
	@Valid
	private Department department;

	public Employee(String name, Department department) {
		this.name = name;
		this.setDepartment(department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
