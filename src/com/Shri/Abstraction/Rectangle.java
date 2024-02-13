package com.Shri.Abstraction;

public class Rectangle extends Shape{
	 float length,breath;
	 

	public Rectangle(float length, float breath) {
		super();
		this.length = length;
		this.breath = breath;
	}


	@Override
	void area() {
		area=length*breath;
		
	}

}