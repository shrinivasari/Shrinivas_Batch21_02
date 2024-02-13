package com.Shri.Interface;

interface MyInterface{
	void myMethod(int x);
}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface my=(x)-> {
			System.out.println("The value of x is= "+x);
		};
      my.myMethod(19);
	}

}
