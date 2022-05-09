package com.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.Newspaper;
@Component
public class NewspaperDaoImpl implements NewspaperDAO {
	@Autowired
	private SessionFactory sessionfactory;
public NewspaperDaoImpl() {
	System.out.println("Object is created "+this.getClass().getSimpleName());
}
	@Override
	public boolean saveNewspaperEntity(Newspaper newspaper) {
		System.out.println("Invoked save Newspaper Entity..");
		Session session = null;
		try {
			session = sessionfactory.openSession();
			session.beginTransaction();
			session.save(newspaper);
			session.getTransaction().commit();
			System.out.println("Newspaper Detils are saved Successfully");
			return true;
		}
		
		catch (HibernateException e){
			System.out.println(e.getMessage());
			
		}
		
		finally {
			if(session!=null) {
			System.out.println("Session is closed");
		}
			
		else {
			System.out.println("Session is not closed");
		}
	}
		return false;
	}

}
