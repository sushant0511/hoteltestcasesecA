package com.java.condition;

import java.util.Scanner;

class TestEvenAndOdd
{
	public String provideOutput(int num)
	{
	
		if(num%2==0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
		
		
	}
}
public class TestCondition {

	public static void main(String[] args) {
		System.out.println("Main works");
		TestEvenAndOdd xyz=new TestEvenAndOdd();
		System.out.println("Enter you value");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		System.out.println(xyz.provideOutput(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
	}
	
	
}
