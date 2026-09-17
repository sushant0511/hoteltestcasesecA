package com.java.testConcept;

public class StudentService {

	public static void main(String[] args) {
		
		DaoCall call=new DaoCall();
		for(Student student:call.userData())
		{
			System.out.println(student.getName()+" "+student.getFees());
		}
		System.out.println("called service");
	}
}
