package br.com.validator.infra.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.com.validator.infra.JPAUtil;

public class JPAUtilTest {

	@Test
	public void shouldReturnAValidConnection() throws Exception {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		
		assertNotNull(entityManager);
	}
}
