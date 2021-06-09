package com.javaex.ex05;

public class Depart extends Employee {
	
	 private String department;

	 public Depart() {
		 
	 }

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showInformation() {
		System.out.println("이름:" + super.getName() + "연봉:" + super.getSalary() + "부서:" + department);
	}
	 
	 
	 
	 
	 
}
