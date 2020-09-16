package com.xworkz.military.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.military.dao.MilitaryDAO;
import com.xworkz.military.dto.MilitaryDTO;
import com.xworkz.military.entity.MilitaryEntity;

@Component
public class MilitaryServiceImpl implements MilitaryService {

	@Autowired
	private MilitaryDAO militaryDAO;
	
	public MilitaryServiceImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public int validateAndCreate(MilitaryDTO militaryDTO) {
	
		try {
			if (Objects.nonNull(militaryDTO)) {
				System.out.println("MilitaryDTO is not null");
				MilitaryEntity entity = new MilitaryEntity();
				System.out.println("created MilitaryEntity object");
				MilitaryDTO dto = new MilitaryDTO();
				System.out.println("created MilitaryDTO object");
				BeanUtils.copyProperties(militaryDTO, entity);
				militaryDAO.save(entity);
			} else {
				System.out.println("MilitaryDTO is null");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
			return 0;
	}

}
