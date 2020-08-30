package com.trainingassignment;

public class Salarycalc {
	String employee_name;
	int hours, extra_hours;
	double rates;
	double salary;
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getExtra_hours() {
		return extra_hours;
	}
	public void setExtra_hours(int extra_hours) {
		this.extra_hours = extra_hours;
	}
	public double getRate() {
		return rates;
	}
	public void setRate(double rates) {
		this.rates = rates;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double pay(int hours, double rates)

	{
		if(hours> 40)
		{
			extra_hours= hours-40;
			salary= (hours*rates)+(extra_hours*rates);
		}
		else
		{
			salary= hours*rates;
		}
		return salary;
	}
	public void diaplayemployee()
	{
		System.out.println("salary="+salary);
	}


}
	


