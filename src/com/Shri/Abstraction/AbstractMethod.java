package com.Shri.Abstraction;

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s ;
		s = new Rectangle(2.3f,4.5f);
		s.area();
		s.show();
		
		s=new Trinagle(2.9f,5.56f);
		s.area();
		s.show();
		
		s=new Square(2.3f);
		s.area();
		s.show();
	}

}
