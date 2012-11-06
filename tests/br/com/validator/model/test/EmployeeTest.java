package br.com.validator.model.test;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.validator.model.Department;
import br.com.validator.model.Employee;

public class EmployeeTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void employeeIsNull() throws Exception {
		Employee employee = new Employee(null, null);
		
		Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(employee);
		
		assertEquals(1, constraintViolations.size());
	}
	

	@Test
	public void employeeWithDepartmentNull() throws Exception {
		Department department = new Department(null);
		Employee employee = new Employee("John", department);
		
		Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(employee);
		
		assertEquals(1, constraintViolations.size());
	}
}
