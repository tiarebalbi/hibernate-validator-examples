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

public class DepartmentTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void departmentWithNullName() throws Exception {
		Department department = new Department(null);
		department.setDescription("IT the best area");
		
		Set<ConstraintViolation<Department>> constraintViolations = validator.validate(department);
		
		assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void departmentWithListOfEmployeesWithOneNullEmployee() throws Exception {
		Employee john = new Employee("John", null);
		Employee mike = new Employee("Mike", null);
		Employee josh = new Employee(null, null);
		
		Department department = new Department("IT");
		department.setDescription("IT the best area");
		department.addEmployee(john);
		department.addEmployee(mike);
		department.addEmployee(josh);
		
		Set<ConstraintViolation<Department>> constraintViolations = validator.validate(department);
		
		assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void departmentWithNullDescription_ValidateProperty() throws Exception {
		Department department = new Department(null, null);
		
		Set<ConstraintViolation<Department>> constraintViolations = validator.validateProperty(department, "name");
		
		assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void departmentWithNullDescription_ValidateValue() throws Exception {
		Set<ConstraintViolation<Department>> constraintViolations = validator.validateValue(Department.class, "name", null);
		
		assertEquals(1, constraintViolations.size());
	}
	
}
