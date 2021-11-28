package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	//a)	Generate an email with the following syntax
	// firstNamelastName@department.company.com
	
	public String generateEmail(String firstName, String lastName, String department) {
		String email= firstName+ lastName + "@" + department +".greatlearning.com";
		return email;
	}
	
	// generate password
	public String generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers= "0123456789";
		String specialCharacters ="!@#$%^&*_+=/.?<>";
		String values= capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random= new Random();
		char[] password= new char[8];
		for(int i=0; i<8; i++) {
			password[i]= values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
		
	}
	
	public void showCreds(Employee emp, String email, String password) {
		System.out.println("Hello"+ emp.getFirstName() + "your generated credentials");
		System.out.println(email);
		System.out.println(password);
	}
	
}
