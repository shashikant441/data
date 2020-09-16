package com.xworkz.military.dao;

import com.xworkz.military.entity.MilitaryLoginEntity;

public interface MilitaryResetpassDAO {

	public MilitaryLoginEntity fetchByEmail(String Email);
	
	public int updateEmailByPassword(String Email, String Password);
	
}
