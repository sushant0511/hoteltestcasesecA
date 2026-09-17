import java.util.Scanner;

public class TestVegeCode {

	public static void main(String[] args) {
		
		System.out.println("How many vegetable you want to enter ?");
		Scanner scanner=new Scanner(System.in);
		int total=scanner.nextInt();
		int id[]=new int[total];
		String name[]=new String[total];
		int quantity[]=new int[total];
		float cost[]=new float[total];
		for(int i=0;i<total;i++)
		{
			System.out.println("Enter item at "+(i+1)+" position");
			id[i]=i+1;
			name[i]=scanner.next();
			quantity[i]=scanner.nextInt();
			cost[i]=scanner.nextFloat();
		}
		
		
		System.out.println("Item avaiable to buy ");
		for(int i=0;i<total;i++)
		{
		
		System.out.println(id[i]+" "+name[i]+" "+quantity[i]+" "+cost[i]);	
			
		}
		
		
		System.out.println("How many items you want to buy ?");
		int buyChoice=scanner.nextInt();
		float bill=0.0f;
		System.out.println("Enter item id you want to buy?");
		int cid=scanner.nextInt();
		System.out.println("How many ?");  // 1
		int cquna=scanner.nextInt();
		for(int i=0;i<buyChoice;i++)
		{
			
			bill=bill+cost[cid-1]*cquna;
		}
		
		System.out.println("Final bill is "+bill);
		
		
		System.out.println("Next Item avaiable to buy ");
		for(int i=0;i<total;i++)
		{
		
		System.out.println(id[i]+" "+name[i]+" "+(quantity[i])+" "+cost[i]);	
			
		}
		
		
		
		
		
		
		
	}
}
