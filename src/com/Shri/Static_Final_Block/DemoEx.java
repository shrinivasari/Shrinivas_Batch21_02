package com.Shri.Static_Final_Block;

public class DemoEx {
	static int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoEx e =new DemoEx();
		DemoEx e1 = new DemoEx();
		
		 e.x=20; // x value will be updated
		 System.out.println(e.x); // the present value of x will be executed
		 
		 e1.x=40;
		 System.out.println(e1.x);
	}

}
