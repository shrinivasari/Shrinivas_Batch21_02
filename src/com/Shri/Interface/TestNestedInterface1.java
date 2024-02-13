package com.Shri.Interface;

interface chat{
	void show();
// Nested Interface 

interface Message{
	void msg();
}
}// CLosing interface Chat
public class TestNestedInterface1 implements chat.Message {
	
	@Override
	public void msg() {
	System.out.println("Welcome to new world");	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chat.Message cm =new TestNestedInterface1();
		cm.msg();
	}

}
