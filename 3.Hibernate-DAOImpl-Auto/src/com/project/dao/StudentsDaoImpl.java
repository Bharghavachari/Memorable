package com.project.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.entity.StudentsInfo;

public class StudentsDaoImpl implements StudentsDAO {

	@Override
	public void insertStudentsEntityData() {
		System.out.println("Invoked Students data insert method");
		SessionFactory sessionfactory = null;
		org.hibernate.Session session = null;
		
		try {
			
			//Configaraion the Hibernate file
			Configuration config = new Configuration ();
			config.addAnnotatedClass(StudentsInfo.class);
			config.configure("Hibernate.cfg.xml");
			sessionfactory=config.buildSessionFactory();
			session = sessionfactory.openSession();
			session.beginTransaction();
			
			//Data insert 
			StudentsInfo  students = new StudentsInfo ( "Rohit", "Sharma", 38);   // auto //remove 5,  error gone
			
			session.save(students);
			session.getTransaction().commit();
			System.out.println("Query is inserted successfully");
		}
		catch (Exception e) {
			
			System.out.println("Inside catch block exception");
			
		}
		finally {
			if(session!= null) {
				System.out.println("session is closed");
			}
			else {
				System.out.println("session is not closed");
			}
			if(sessionfactory!= null) {
				System.out.println("sessionfactory is closed");
			}
			else {
				System.out.println("sessionfactory is not closed");
			}
			
		}
	}

	@Override
	public void getStudentsEntityDataByID() {
		System.out.println("Invoked Students data get ID method");
		SessionFactory sessionfactory = null;
		org.hibernate.Session session = null;
		
		try{
			//Configaraion the Hibernate file
			Configuration config = new Configuration ();
			config.addAnnotatedClass(StudentsInfo.class);
			config.configure("Hibernate.cfg.xml");
			sessionfactory=config.buildSessionFactory();
			session = sessionfactory.openSession();
			session.beginTransaction();
			
			StudentsInfo students = session.get(StudentsInfo.class, 4);
			System.out.println("read id done"+students);
		}
		catch(Exception e) {
			System.out.println("insside catch block Exception");
			
		}
		finally {
			if(session!= null) {
				System.out.println("session is closed");
			}
			else {
				System.out.println("session is not closed");
			}
			if(sessionfactory!= null) {
				System.out.println("sessionfactory is closed");
			}
			else {
				System.out.println("sessionfactory is not closed");
			}
	}
	}

	@Override
	public void updateStudentsEntityData() {
		System.out.println("Invoked Students data Update method");
		SessionFactory sessionfactory = null;
		org.hibernate.Session session = null;
		Transaction trans = null;
		
		try {
			//Configaraion the Hibernate file
			Configuration config = new Configuration ();
			config.addAnnotatedClass(StudentsInfo.class);
			config.configure("Hibernate.cfg.xml");
			sessionfactory=config.buildSessionFactory();
			session = sessionfactory.openSession();
			//session.beginTransaction();                   not necessary
		
			StudentsInfo students = session.get(StudentsInfo.class, 1);
			System.out.println("Students Entity"+students);
			students.setFirstName("Bhargava");
			trans =session.beginTransaction();
			session.update(students);
			trans.commit();
			System.out.println("Data is Update sucessfully");
			System.out.println("After Update Entity"+students);
			
		}
		catch(Exception e) {
			System.out.println("inside catch block eexception");
			trans.rollback();
		}
		finally {
			if(session!= null) {
				System.out.println("session is closed");
			}
			else {
				System.out.println("session is not closed");
			}
			if(sessionfactory!= null) {
				System.out.println("sessionfactory is closed");
			}
			else {
				System.out.println("sessionfactory is not closed");
			}
	}
	}

	@Override
	public void deleteStudentsEntityData() {
		System.out.println("Invoked Students data Delete method");
		SessionFactory sessionfactory = null;
		org.hibernate.Session session = null;
		Transaction trans = null;
		try {
			Configuration config = new Configuration ();
			config.addAnnotatedClass(StudentsInfo.class);
			config.configure("Hibernate.cfg.xml");
			sessionfactory=config.buildSessionFactory();
			session = sessionfactory.openSession();
			
			StudentsInfo students = session.get(StudentsInfo.class, 7);
			System.out.println("Students Entity"+students);
			
			trans = session.beginTransaction();
			session.delete(students);
			trans.commit();
			System.out.println("Students Data is deleted Successfully");
			
		}
		catch(Exception e){
			System.out.println("inside catch block Exception");
			trans.rollback();
		}
		finally {
			if(session!= null) {
				System.out.println("session is closed");
			}
			else {
				System.out.println("session is not closed");
			}
			if(sessionfactory!= null) {
				System.out.println("sessionfactory is closed");
			}
			else {
				System.out.println("sessionfactory is not closed");
			}
	}
	}
}
