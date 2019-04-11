package com.youbaoplus.tee;

import java.util.Date;

public class Employee {
	
	private String name;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String major;
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private int age;
	private int salary;
	
	
	private Date hirDay;
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getHirDay() {
		return hirDay;
	}

	public void setHirDay(int year,int mon,int day) {
		this.hirDay=new Date(year, mon, day);
		//this.hirDay = hirDay;
	}

	/*@Override
	public String toString() {
		String e.
		return super.toString();
	}*/
	public static void main(String[] args) {
		//new Employee();
	}
	
	public void raiseSalary(int raise){
		this.salary=this.salary+raise;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
