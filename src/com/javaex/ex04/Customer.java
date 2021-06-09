package com.javaex.ex04;

public class Customer extends User {

	private int point;
	
	public Customer() {
		
	}

	public Customer(String id, int password, String name, int point) {
		super(id, password, name);
		this.point = point;	
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	public void showInfo() {
		
		System.out.println("#아이디:" + id + "#패스워드: " + password
				+ "#이름:" + name + "#포인트" + point);
	}

}
