package com.xworkz.military.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.military.service.ResetService;

public class ResetController {

	
	public ResetController() {
		System.out.println("Created /t"+this.getClass().getSimpleName());
	}
	
	@Autowired
	private  ResetService resetService;
	
	@RequestMapping(value = "/resetpass.odc", method = RequestMethod.POST)
	public String militaryResetpass(@RequestParam String Email, Model model) {
		try {
			System.out.println(":::::Start Invoked Resetpass() method:::::");
			System.out.println(":::::Start Email:::::" + Email);
			int check = this.resetService.validatefetchByEmail(Email);
			System.out.println("Check@@@@@@@@@@@@"+check);
			if (check == 0) {
				System.out.println(":::::Successfully All class and interface:::::");
				return "login.jsp";
			} else {
				model.addAttribute("value", "Email Not Matching");
				return "reset.jsp";
			}
		} catch (Exception e) {
			System.out.printf(e.getMessage(), e);
		}
		System.out.println("End Invoked militaryResetpass() method");
		return null;
	}
	
}
