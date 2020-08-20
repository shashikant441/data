package com.xworkz.military.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.military.entity.MilitaryEntity;

@Component
public class MilitaryDAOImpl implements MilitaryDAO{

	
	public MilitaryDAOImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	@Autowired
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void save(MilitaryEntity militaryEntity) {
		System.out.println("Start MilitaryDAOImpl "+militaryEntity);
		Session session = this.factory.openSession();
		try {
			System.out.println("Begin the Transaction");
			session.beginTransaction();
			System.out.println("Save the Entity"+militaryEntity);
			session.save(militaryEntity);
			
			
			System.out.println("Commit the Transcation");
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End of the Save Method");

		} catch (Exception e) {
			System.out.println("Create is Unsuccesssfully And RollBack");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("Using Finally Session is Closed");
		}
		System.out.println("End  MilitaryDAOImpl Class save()");
	}
		
}


