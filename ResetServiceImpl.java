package com.xworkz.military.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.military.dao.MilitaryResetpassDAO;
import com.xworkz.military.entity.MilitaryLoginEntity;

@Service
public class ResetServiceImpl implements ResetService {

	@Autowired
	private MilitaryResetpassDAO militaryResetpassDAO;
	
	@Autowired
	private JavaMailSender mailSender;

	public int validatefetchByEmail(String Email) {
		System.out.println("Start : MilitaryResetpassServiceImpl ValidatefetchByEmail()");
		System.out.println("Start : MuserEmail validateAndCreate()" + Email);
		try {
			if (!Email.isEmpty()) {
				System.out.println("Email is valid");

				MilitaryLoginEntity militaryLoginEntity = new MilitaryLoginEntity();
				militaryLoginEntity = militaryResetpassDAO.fetchByEmail(Email);
				System.out.println("Successfully All class and interface");
				if (militaryLoginEntity != null) {
					System.out.println("militaryLoginEntity is valid");

					char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
					StringBuilder sb = new StringBuilder(8);
					Random random = new Random();
					for (int i = 0; i < 8; i++) {
						char c = chars[random.nextInt(chars.length)];
						sb.append(c);
					}
					String password = sb.toString();
					

					System.out.println("militaryLoginEntity is valid" + password);
					int result = militaryResetpassDAO.updateEmailByPassword(Email, password);
					System.out.println(result);
					if (result > 0) {
						String email = Email;
						String pass = password;
						String text = "Your EmailId Is : "+email+"\n Your Password Is : "+password;
						System.out.println(email);
						System.out.println(pass);
						
						SimpleMailMessage messageSend = new SimpleMailMessage();
						messageSend.setTo(email);
						messageSend.setSubject(pass);
						messageSend.setText(text);
						mailSender.send(messageSend);
						return 0;
					} else {
						return 1;
					}
				} else {
					return 1;
				}
			} else {
				System.out.println("Email is not valid");
				return 1;
			}
		} catch (Exception e) {
			System.out.println("Start : Exception ResetServiceImpl Handeler" + e);
			e.printStackTrace();
		}
		System.out.println("End : ResetServiceImpl ValidatefetchByEmail()");
		return 1;
	}

}
