package com.xworkz.military.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.military.entity.MilitaryLoginEntity;

@Component
public class MilitaryResetpassDAOImpl implements MilitaryResetpassDAO{

	public MilitaryResetpassDAOImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	private SessionFactory factory;
	
	@Autowired
	public void SetFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public MilitaryLoginEntity fetchByEmail(String Email) {
		System.out.println(" MilitaryResetpassDAOImpl fetchByEmail()");
		System.out.println(" personalEmail" + Email);
		Session session = this.factory.openSession();
		try {
			Query query = session.getNamedQuery("fetchPersonalByEmailI");

			query.setParameter("email", Email);
			// STEP 2: PROCESS
			Object result = query.uniqueResult();
			MilitaryLoginEntity entity = (MilitaryLoginEntity) result;
			System.out.println(entity);
			return entity;
		} catch (Exception e) {
			System.out.println("Exception Handeled MilitaryLoginEntity");
			e.printStackTrace();
		}
		System.out.println("End : MilitaryResetpassDAOImpl fetchByEmail()");
		
		return null;
	}

	public int updateEmailByPassword(String Email, String Password) {
		System.out.println("Start : MilitaryResetpassDAOImpl updateEmailByPassword()");
		System.out.println("Start : personalEmail" + Email);
		System.out.println("Start : personalEmail:::::" + Password);
		Session session = this.factory.openSession();
		session.beginTransaction();
		try {
			System.out.println("Start : try {} Block" + Password);
			Query query = session.getNamedQuery("updateEmailByPassword");
			query.setParameter("email", Email);
			query.setParameter("password", Password);
			int res = query.executeUpdate();
			session.getTransaction().commit();
			return res;
		} catch (Exception e) {
			System.out.println("Exception Handeled MilitaryLoginEntity");
			e.printStackTrace();
		}
		System.out.println("End : MilitaryResetpassDAOImpl updateEmailByPassword()");
		return 0;
	}

}
