package com.Shri.Interface;

interface print{
	  void printrectangele(); }

interface drawable{
	  void show();
}

class Printable implements print,drawable{
	
	
	@Override
	public void show() {
		System.out.println("Rectangle");
		
	}

	@Override
	public void printrectangele() {
		System.out.println("Length*Breath");
		
	}
	
	public static void main(String[] args) {
		Printable pt = new Printable();
		pt.show();
		pt.printrectangele();
	}

}