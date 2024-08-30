package com.org.OOPS;

class Student
{
	int rollNum;
	String StudentName;
	int age;
	
	void Studying()
	{
		System.out.println("Student is studying");
	}
	void Playing()
	{
		System.out.println("Student is playing");
	}
}
public class Launch1 {

	public static void main(String[] args) {
		
	Student sd= new Student();
	sd.Playing();
	sd.Studying();
	}

}

