package com.Shri.Static_Final_Block;

class Test{
	static int a=20; // static variable
	public int b=30;
	
	void read() {
		int b=40; 
		// we can't use the static inside the Method
		System.out.println(a);
		System.out.println(b);
	}
}
public class StaticProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t = new Test();
		
		t.read();
		System.out.println(Test.a); // to access the static variable we need to give "Classname.Variable Name"
		System.out.println(t.b);
	}

}
