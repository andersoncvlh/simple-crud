package br.com.oak.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository {

	@PersistenceContext
	protected EntityManager entityManager;
	
}
