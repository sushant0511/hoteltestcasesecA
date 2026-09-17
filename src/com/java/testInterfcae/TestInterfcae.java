package com.java.testInterfcae;

interface One
{
	int a=10;
	public abstract void call();
	public abstract void nameAdd();
		
}

interface Two
{
	int b=10;
	public void callTwo() ;
}

class Three implements One,Two
{

	@Override
	public void call() {
		System.out.println("1");
		
	}

	@Override
	public void nameAdd() {
		System.out.println("2");
		
	}

	@Override
	public void callTwo() {
		System.out.println("3");
		
	}
	
}

public class TestInterfcae {

	public static void main(String[] args) {
		
		Two two=new Two() {
			
			@Override
			public void callTwo() {
				System.out.println("Test");
				
			}
		}; 
		
		
		System.out.println("Main");
		
	}
}
