import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		// input should be in loop and operation of array should be in loop
		Scanner scanner=new Scanner(System.in);
		// string input same size int array should be declare user define
		//j1a2v3a4c5o6d7e8  in different lines no space in string
		String s="Javacode";
		int b[]=new int[s.length()];
//		for(int i=0;i<s.length();i++)
//		System.out.println(s.charAt(i));
		System.out.println("ENter your array");
		for(int i=1;i<6;i++)  // a[5] 
		{
			a[i]=scanner.nextInt();
					
		}
		for(int i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}	
	}
}
