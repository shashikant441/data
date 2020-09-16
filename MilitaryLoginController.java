package com.xworkz.military.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.military.service.MilitaryLoginService;

@Component
@RequestMapping("/")
public class MilitaryLoginController {

	
	
	public MilitaryLoginController() {
		System.out.println("Created /t"+this.getClass().getSimpleName());
	}
	
	@Autowired
	private MilitaryLoginService militaryLoginService;
	
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String militaryLogin(@RequestParam String Email, String Password, Model model) {
		try {
			System.out.println("Start Invoked militaryLogin()");
			System.out.println("Email:"+Email);
			System.out.println("Password:"+ Password);
			int check = this.militaryLoginService.validatefetchByEmailAndPassword(Email, Password);
			if(check ==0) {
				model.addAttribute("Email", "Password");
				return "submit.jsp"; 
			}else {
				model.addAttribute("value", "Email or Password is wrong");
			}
			
		}catch (Exception e) {
			System.out.printf(e.getMessage(), e);
		}
		System.out.println("End Invoked militaryLogin()");
		return null;
		
	} 

}
