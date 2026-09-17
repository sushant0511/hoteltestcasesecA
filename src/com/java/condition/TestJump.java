package com.java.condition;

import java.util.Scanner;

class Jump
{
	public void showDiv(int start, int end)  // 40 
	{
		int c=0;
		
		for(int i=start;i<=end;i++)  // 20 to 40 
		{
			if(i%3==0)  //   21
			{
				c++;
				
			}
			
			else  if(i%4==0)  // 20
			{
				c++;
			}
			
			
			
		}
		System.out.println("/ by 3= "+c);
		System.out.println("/ by 4= "+c);
	}
	
	
}


public class TestJump {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enete your range");
		Jump jump=new Jump();
		jump.showDiv(scanner.nextInt(), scanner.nextInt());
	}
}
