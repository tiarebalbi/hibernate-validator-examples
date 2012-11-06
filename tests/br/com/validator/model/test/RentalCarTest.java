package br.com.validator.model.test;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.validator.model.Car;
import br.com.validator.model.RentalCar;

public class RentalCarTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void rentalStationIsNull() throws Exception {
		Car rentalCar = new RentalCar("Morris", true);
		
		Set<ConstraintViolation<Car>> constraintViolations = validator.validate(rentalCar);
		
		assertEquals(3, constraintViolations.size());
	}
	
}
