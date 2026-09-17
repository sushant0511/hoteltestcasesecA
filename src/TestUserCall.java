
class Student
{
	int id;
	String name;
	float fees;
	
	
	public Student(int id, String name, float fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
	
	
	
	
}
public class TestUserCall {

	
	public static void main(String[] args) {
		
		Student s1=new Student(1, "Amit", 234.56f);
		
	System.out.println(s1);
		
		
	
	
	
	}
}
