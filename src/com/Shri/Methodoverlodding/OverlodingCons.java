package com.Shri.Methodoverlodding;

public class OverlodingCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		System.out.println(p);
		
		Point p1= new Point(4.5f);
		System.out.println(p1);
		
		Point p2 = new Point(5.5f,4.5f);
		System.out.println(p2);
		
		System.out.println(MethodOverloding.addition(4, 8));
		System.out.println(MethodOverloding.addition(4, 8.3f));
		System.out.println(MethodOverloding.addition(4.7f, 8));
		System.out.println(MethodOverloding.addition("HI", "Hello"));
	}

}
