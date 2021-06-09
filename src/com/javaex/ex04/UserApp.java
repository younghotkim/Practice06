package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] shop = new User[3];
		
		User c1 = new Customer("jws",1234,"정우성",1000);
		User c2 = new Customer("yjs",2345,"이효리",2000);
		User e1 = new Employee("master",7788,"운영자",5000000);
		
		shop[0] = c1;
		shop[1] = c2;
		shop[2] = e1;
		
		for (int i = 1; i<shop.length; i++) {
			
			shop[i].showInfo();
			
		}
		
		
		

	}

}
