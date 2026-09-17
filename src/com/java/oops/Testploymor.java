package com.java.oops;

import java.util.Scanner;

class TestOverload
{
	public void add(int a) {
		int b=20;
		System.out.println(a+b);
		//System.exit(1);
	}
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
}
public class Testploymor {

	public static void main(String[] args) {
		System.out.println("called first");
		TestOverload overload=new TestOverload();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter values");
		overload.add(scanner.nextInt());
		
		System.out.println("Enetr two values");
		overload.add(scanner.nextInt(), scanner.nextInt());
	}
}
