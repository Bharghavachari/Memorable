package com.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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
	@Override
	public Newspaper getNewspaperEnity(String NewspaprName) {
		System.out.println("Invoked get newspaper entity method..");
		Session session = null;
		try {
			session=sessionfactory.openSession();
			Query <Newspaper> query = session.getNamedQuery("Newspaper.getpaperObject");
			query.setParameter("name", NewspaprName);
			Newspaper newspaperEnity=query.uniqueResult();
			System.out.println("Found newspaper :" + newspaperEnity);
			if (newspaperEnity !=null) {
				return null;
				
			}
			else {
				System.out.println("Found newspaper is not found");
				return null;
			}
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		if(session !=null) {
			System.out.println("session is closed");
		}
		else {
			System.out.println("session is not closed");
		}
		return null;
	}

}
