package com.Shri.Abstraction;

public class Trinagle extends Shape{
    float l,h;
    
    
	public Trinagle(float l, float h) {
		
		this.l = l;
		this.h = h;
	}

	@Override
	void area() {
		
		area=0.5f*(l*h);
		
	}
}
