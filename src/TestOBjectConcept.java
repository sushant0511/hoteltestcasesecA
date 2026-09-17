class TestObj
{
	protected void show()
	{
		int a,b,c;
		
	
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
		
		System.out.println("Hi from show");
	}
}



public class TestOBjectConcept {

	public static void main(String[] args) {
		//classname objectname=new classname();
			TestObj xyz=null;
			xyz=new TestObj();
			xyz.show();
		
		System.out.println("Main block");
	}
}







