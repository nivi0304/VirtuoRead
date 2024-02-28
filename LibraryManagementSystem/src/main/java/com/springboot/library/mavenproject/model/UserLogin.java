package com.springboot.library.mavenproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserLogin {

	
		
		private String fname;
		private String lname;
		@Id
		private String email;
		private String password;
		private String contact;
		private String country;
		
		UserLogin(){
			
		}
		@Override
		public String toString() {
			return "UserLogin[fname=" + fname + ", lname=" + lname + ", email=" + email + ", password= " + password + 
					", contact =" + contact +", country =" +country + "]";
					
		}
		public UserLogin(String fname,String lname,String email, String password, String contact, String country) {
		   super();
		   this.fname=fname;
		   this.lname=lname;
		   this.email=email;
		   this.password=password;
		   this.contact=contact;
		   this.country=country;
		}
		
		
		
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		

	
	
}