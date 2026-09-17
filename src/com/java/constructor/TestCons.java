package com.java.constructor;

class Call
{
	public Call()
	{
		System.out.println("Object init without ref");
		
		add();
	}
	
	
	public void add()
	{
		new User().sub();
		
		System.out.println("call method");
	}
}


class User
{

	public  void sub()
	{
		System.out.println("Sub");
	}
}


public class TestCons {

	public static void main(String[] args) {
		// Right to left
		 new Call();  // memory flush by default
		
		
	}
}
