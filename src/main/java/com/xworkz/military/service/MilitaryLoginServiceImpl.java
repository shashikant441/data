package com.xworkz.military.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.military.dao.MilitaryLoginDAO;
import com.xworkz.military.entity.MilitaryLoginEntity;

@Component
public class MilitaryLoginServiceImpl implements MilitaryLoginService {

	
	public MilitaryLoginServiceImpl() {
		System.out.println("Created /t"+this.getClass().getSimpleName());
	}
	
	@Autowired
	private MilitaryLoginDAO militaryLoginDAO;
	
	public int validatefetchByEmailAndPassword(String Email, String Password) {
		
		try {
			if (!Email.isEmpty() && !Password.isEmpty()) {
				System.out.println("Email is valid");

				MilitaryLoginEntity militaryLoginEntity = new MilitaryLoginEntity();
				militaryLoginEntity = militaryLoginDAO.fetchByEmailAndPassword(Email, Password);
				
				if (militaryLoginEntity != null) {
					System.out.println("militaryLoginEntity is Not Empty");
					return 0;
				} else {
					System.out.println("militaryLoginEntity is Empty");
					return 1;
				}
			} else {
				System.out.println("Email is not valid");
				return 1;
			}
		} catch (Exception e) {
			System.out.println("Start : Exception Handler" + e);
			e.printStackTrace();
		}
		System.out.println("End : MilitaryLoginServiceImpl validateAndCreate()");
		
		
		return 0;
	}

}
