package com.java.condition;

import java.util.Scanner;

class LogicofSOD
{
	public int sumOfDigits(int num)  // 543 num will be provided from main
	{
		int sum=0;
		// i=0;i<10;i++
		while(num>0) //  0
		{
		
		int rem=num%10;   //    REM =5
		sum=sum+rem;   // 12
		//System.out.println("Sum0="+sum);  // 12
			num=num/10;  // 0
		}
		
			
		System.out.println("Final");
		return sum;
	}
}


public class SumofDigits {

	public static void main(String[] args) {
		
		LogicofSOD sod=new LogicofSOD();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr your number");
		int a=scanner.nextInt();
		// 0 
		while(a>0)  // 543
		{
		int rem=a%10;
		a=a/10;
		if(rem==0)  // 5
		{
			System.exit(1);
		}
		else  // 
		{
			System.out.println( sod.sumOfDigits(a));	
		}
		
		}
		
		
		
	}
	
}
