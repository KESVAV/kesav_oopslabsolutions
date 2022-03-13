package com.gl.la.client;

import java.util.Scanner;

import com.gl.la.models.Employee;
import com.gl.la.services.CredentialServices;

public class ProfileGeneratorClient {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" please enter  your depart numbers as shown below  ");
		System.out.println(" for HR  -----------------> 0");
		System.out.println(" for Technical   ---------> 1");
		System.out.println(" for Legal   ---   ------> 2");
		System.out.println(" for Admin   ---   ------> 3");
		
		
		int option = sc.nextInt();
	    System.out.println (" please enter  your Firs Name");
	    String firstName = sc.next();
	    System.out.println (" please enter  your Last Name");
	    String lastName = sc.next();
	    
		Employee employee = new Employee(firstName, lastName);
		switch(option){
		case 0:
			employee.setDept("HR");
			break;
		case 1:
			employee.setDept("Technical");
			break;
		case 2:
			employee.setDept("HR");
			break;
		case 3:
			employee.setDept("HR");
			break;
		}
		String emailAddress = CredentialServices.generateEmailAdress(firstName,lastName, employee.getDept());
		employee.setEamialAddress(emailAddress);
		System.out.println("please enter the password length");
		int length =sc.nextInt();
		String password = CredentialServices.generatePassWord(length);
		employee.setPassWord(password);
		CredentialServices.showCredentials(employee);
		sc.close();
		
		
	}

}
