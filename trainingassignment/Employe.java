package com.trainingassignment;

public class Employe {
	
	String firstname;
	String lastname;
	double monthlysal;
	
	public Employe()
	{
		firstname=null;
		lastname=null;
		monthlysal=0;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getMonthlysal() {
		return monthlysal;
	}

	public void setMonthlysal(double monthlysal) {
		this.monthlysal = monthlysal;
	}
	
	}
	


