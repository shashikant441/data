package com.xworkz.military.dao;

import com.xworkz.military.entity.MilitaryLoginEntity;

public interface MilitaryLoginDAO {

	public MilitaryLoginEntity fetchByEmailAndPassword(String Email, String Password);
}
