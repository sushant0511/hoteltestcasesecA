package com.java.oops;

class Parent
{
	int a=10; //class or global
	public void name() {
		System.out.println("I have a username");
	}
}
class Child extends Parent
{	int b=20;
	public void accountNumber()
	{
		System.out.println("I have an account number");
		
	}
	@Override
	public void name() {
		System.out.println(a+b);
		System.out.println("I have a username with account number");
	}

}
public class TestInheri {

	public static void main(String[] args) {
		Child account=new Child();
		account.b=25;   // instance 
		account.name();
		account.a=20;
		//System.out.println(a+b);
		//account.accountNumber();
		account.name();
	}
}
