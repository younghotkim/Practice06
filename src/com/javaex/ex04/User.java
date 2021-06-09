package com.javaex.ex04;

public class User {
	
	protected String id;
	protected int password;
	protected String name;
	
	public User() {
		
	}
	
	public User(String id, int password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		
		System.out.println("#아이디: " + id + "#패스워드: " + password);
		
	}
	
	
}
