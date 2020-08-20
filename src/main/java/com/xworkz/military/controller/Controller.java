package com.xworkz.military.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.military.dto.MilitaryDTO;
import com.xworkz.military.service.MilitaryService;

@Component
@RequestMapping("/")
public class Controller {

	public Controller() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	@Autowired
	private MilitaryService militaryService;
	
	
	
	@RequestMapping(value = "/submit.do", method = RequestMethod.POST)
	public String flower(MilitaryDTO militaryDTO, Model model) {
		try {
			System.out.println("Start Invoked miliatry");
			System.out.println("Start FlowerDTO" + militaryDTO);
			
			int check = this.militaryService.validateAndCreate(militaryDTO);
			if (check == 0) {
				
				model.addAttribute("militaryDTO", militaryDTO);
				return "success";
			
			} else {
				System.out.println("Data is Not Validated Back to Main Page");
				return "index.jsp";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End Invoked military");
		return null;
	}
	
	
}
