package com.project.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.entity.StudentsInfo;


public class Tester {
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(StudentsInfo.class);
		configuration.configure("Hibernate.cfg.xml");
		
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		StudentsInfo student = new StudentsInfo(8,"Virat","Kohli",36);
		
		session.save(student);
		System.out.println("Data is inserted Sucessfully");
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();

	}
}
