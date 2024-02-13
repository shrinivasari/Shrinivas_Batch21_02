package com.Shri.Static_Final_Block;

public class FinalVariable {
	final int d; // we need to always assign the values
	final String name;
	
	
	public FinalVariable() {
		
		this.d = 30;
		this.name = "Chaithra";
	}


	static final int a;// to initialize a
	static {
		a=30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable v = new FinalVariable();
        System.out.println(a);
        System.out.println(v.d);
        System.out.println(v.name);
	}

}
