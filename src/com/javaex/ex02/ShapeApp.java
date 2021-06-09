package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
	
	//생성자 실행 순위 예상
	//Shape2-->Shape1-->Triangle1-->Shape2-->Triangle2-->Shape2-->Triangle3
		
		
		
		
	}

}

