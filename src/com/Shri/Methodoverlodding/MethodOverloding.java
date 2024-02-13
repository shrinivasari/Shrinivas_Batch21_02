package com.Shri.Methodoverlodding;

public class MethodOverloding {
	public static int addition(int a,int b) {
		return a+b;
		
	}
	public static int addition(int a,float b) {
		return (int) (a+b);
		
	}
	public static float addition(float a,int b) {
		return a+b;
		
	}
	public static String addition(String a,String b) {
		return a+b;
		
	}
}
