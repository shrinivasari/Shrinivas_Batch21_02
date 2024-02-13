package com.Shri.Interface;

interface Animale{
	void print();
}

interface Dog extends Animale{
	void sound();
}
public class UseOfExtendInINterface implements Dog {
	@Override
	public void print() {
		System.out.println("Animal Name is Dog");
		
	}

	@Override
	public void sound() {
		System.out.println("Sound of Dog id Barking");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfExtendInINterface obj=new UseOfExtendInINterface();
		obj.print();
		obj.sound();
	}

}
