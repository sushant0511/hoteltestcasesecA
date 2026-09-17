package com.java.testConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaoCall {

	public List<Student> userData() {
		Scanner scanner=new Scanner(System.in);
		
		Student s1=new Student(1, "User",234.45f);
		Student s2=new Student(2, "UserNew", 1234.56f);
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		
		return list;
	}
	
}
