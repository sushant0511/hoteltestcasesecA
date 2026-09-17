package com.java.oops;

class TestConsN
{
	public TestConsN() {  // public and no return type
		System.out.println("Hi from constructor");
	}
	
	public TestConsN(int a) {  // public and no return type
		System.out.println("Hi from constructor overload");
	}
	
	public void call() {
		System.out.println("Hi from call");
	}
	
}
class CallPrevious extends TestConsN 
{
	

	
	@Override
	public void call() {
		System.out.println("Hi from call 2");
	}
}
public class TestCons {

	public static void main(String[] args) {
		CallPrevious previous=new CallPrevious();
		// user input int type and its range should be from 3-20
		new TestConsN(11);
		previous.call();
	}
}
