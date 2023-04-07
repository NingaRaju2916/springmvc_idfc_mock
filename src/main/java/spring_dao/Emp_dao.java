package spring_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import spring_dto.Emp_class;
@Component
public class Emp_dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Emp_class class1) {
		entityTransaction.begin();
		entityManager.persist(class1);
		entityTransaction.commit();
		
	}
	
	
	public Emp_class fetch(String email) {
		Emp_class class1= entityManager.find(Emp_class.class, email);
		return class1;
	}
	
		
	
}
