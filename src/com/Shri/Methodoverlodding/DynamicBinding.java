package com.Shri.Methodoverlodding;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainBank mb;
		
		mb = new Subbank1();
		
		System.out.println(mb.getRateOfInterst());
		
		mb = new Subbank2();
		System.out.print(mb.getRateOfInterst());
	}

}
