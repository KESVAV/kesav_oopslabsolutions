package com.gl.la.models;

public class Employee {
	private  String firstName;
	private  String lastName;
	private String dept;
	private String password;
	private String emailaddress;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
		
		}
     public String getFirstName() {
    	 return firstName;
     }
     public void  setFirstName(String firstName) {
    	 this.firstName=firstName; 
     }

     public String getLastName() {
    	 return lastName;
     }
     public void setLastName(String lastName) {
    	 this.lastName =lastName; 
     }
     
     public void setDept(String dept) {
    	 this.dept =dept; 
    	 
     }
     public String getDept() {
    	 return dept;
     }
     public String getPassWord() {
    	 return password;
     }
     public void setPassWord(String password) {
    	 this.password=password; 
     }
     public String getEmailAdress() {
    	 return emailaddress;
     }
     public void setEamialAddress(String emailaddress) {
    	 this.emailaddress = emailaddress; 
     }
}

