package com.Shri.Static_Final_Block;

class Write{
	static int a=10;
	// static is executed before the instance is created
	static void display() {
		System.out.println(a);
		
	}
}
public class BlockStatic {
	static void read(){
		System.out.println("Hi, welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		Write w =new Write();
		w.display();
		
		
		// Instance block
		{
			System.out.println("This Reva University");
		}

	}

}
