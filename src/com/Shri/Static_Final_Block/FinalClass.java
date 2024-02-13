package com.Shri.Static_Final_Block;

final class Student { // it can't be extended by subclass
	 final int x=10;
	 
	 final static int y; // static block is used to initialize
	 final static int z=20; // we ca't change the value
	 
	 static {
		 y=100;
		 System.out.println("Value of z="+z);
	 }
	 
	final void display() {// final Method()
		System.out.println("Value of X,Y,Z"+ x  + y);
	}
}
class Welcome {//extends Student  //extends Student can't be done due to final keyword is used in class
	// we can't create child class for final class and polyimorpizm
	Student s = new Student();
	
}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.display();
	}

}
