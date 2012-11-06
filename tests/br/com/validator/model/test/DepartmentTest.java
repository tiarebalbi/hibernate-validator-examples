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

public class DepartmentTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void departmentIsNull() throws Exception {
		Department department = new Department(null);
		
		Set<ConstraintViolation<Department>> constraintViolations = validator.validate(department);
		
		assertEquals(1, constraintViolations.size());
	}
}
