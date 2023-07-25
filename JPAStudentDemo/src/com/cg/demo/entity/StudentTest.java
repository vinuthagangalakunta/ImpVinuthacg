package com.cg.demo.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setStudId(101);
		student.setStudName("vini");
		
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		//Student s1=em.find(Student.class, 100);
		//System.out.println(s1);
		//s1.setStudName("Gangalakunta vinutha");

		//em.getTransaction().begin();
		//em.detach(s1);
		//em.persist(s1);
		//em.merge(s1);
		//em.getTransaction().commit();
		//System.out.println(s1);
		//em.getTransaction().begin();
		//em.remove(em.find(Student.class, 5100));
		//em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
