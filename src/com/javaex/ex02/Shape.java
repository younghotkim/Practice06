package com.javaex.ex02;

public class Shape {
	
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("생성자 Shape1 실행");
	}

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 shape2 실행");
	}
	
	

}

