package com.Shri.Abstraction;

public abstract class Shape {
protected float area;
	
	// only showing functionality hiding the implementation
	
	// abstract Method
	 abstract void area();// for abstract method we use semicolon;
	
	 // instance or Concrete Method
	 void show() {
		 System.out.println("area is = "+ area);
	 }
}
