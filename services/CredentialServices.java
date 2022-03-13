package com.gl.la.services;

import java.util.Random;

import com.gl.la.models.Employee;
public final  class CredentialServices {
//generate email addresses
	// generate pass word
	//display email id
	//display password
	public final static String generateEmailAdress(String fistName, String lastName, String dept) {
		return fistName+"_"+lastName +"@"+dept+"company.com";
		}
	
   public final static String generatePassWord( int length) {
	
	String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallletters = "abcdefghijklmnopqrstuvwxys";
	String numbers = "0123456789";
	String specialcharcters = "!@#$%^&*(_+?<>/";
    String pwcode = capitalletters+smallletters+numbers+specialcharcters;
    Random random = new Random();
    if(length<8) {
    	throw new IllegalArgumentException ("password length must be more than 8 charcters long");
    }
    
    char[] password = new char[length];
    for (int index=0; index<length; index++) {
    	int randomnumber= random.nextInt(pwcode.length());
    	char c = pwcode.charAt(randomnumber);
    	password[index]=c;
    	
    }
    return String.copyValueOf(password);
   
} 
   public static void showCredentials(Employee employee) {
	   System.out.println( "  " +employee.getFirstName()+"  " +employee.getLastName());
	   System.out.println( "Employee First Name  " +employee.getFirstName());
	   System.out.println( "Employee Last Name  " +employee.getLastName());
	   System.out.println( "Employee Email Address  " +employee.getEmailAdress());
	   System.out.println( "Employee Email Address Password  " +employee.getPassWord());

   }
}
