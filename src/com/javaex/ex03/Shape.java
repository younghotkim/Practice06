package com.javaex.ex03;

public class Shape {
	
	protected String fillColor; //private-->protected
	protected String lineColor; //private-->protected
	
	public Shape () { //디폴트 생성자 생성
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}



	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}



	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	
}

