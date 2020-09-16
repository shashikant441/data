package com.xworkz.military.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.military.entity.MilitaryLoginEntity;

@Component
public class MilitaryLoginDAOImpl implements MilitaryLoginDAO {

	public MilitaryLoginDAOImpl() {
		System.out.println("Created /t"+this.getClass().getSimpleName());
	}
	
	private SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	
	public MilitaryLoginEntity fetchByEmailAndPassword(String Email, String Password) {
		System.out.println(":::::Start : MilitaryLoginDAOImpl Class Check EmailAndPassword():::::");
		System.out.println(":::::Start : personalEmail:::::" + Email);
		System.out.println(":::::Start : personalPassword:::::" + Password);
		Session session = this.factory.openSession();
		try {
			Query query = session.getNamedQuery("fetchPersonalByEmailIdAndPassword");

			query.setParameter("email", Email);
			query.setParameter("password", Password);

			// STEP 2: PROCESS
			Object result = query.uniqueResult();
			MilitaryLoginEntity entity = (MilitaryLoginEntity) result;
			System.out.println(entity);
			return entity;
		} catch (Exception e) {
			System.out.println(":::::Exception Handeled MilitaryLoginEntity:::::");
			e.printStackTrace();
		}
		System.out.println(":::::End : TempleLoginDAOImpl Class Check EmailAndPassword():::::");
		return null;
	}

}
