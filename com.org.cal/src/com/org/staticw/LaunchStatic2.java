package com.org.staticw;
class Student
{
	int id;
	String name;
	String city;
	static int count;
	/*IF there is any common code which need to write in constructor its wish to write it in INIT block because init block execute before constructor */
	{
		count++;
	}
	Student()
	{
		System.out.println("Zero pqram constructor");
	}
	Student (int id, String city,String name)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		//count++;
	}
}
public class LaunchStatic2 {

	public static void main(String[] args) {
	
		Student st= new Student(1,"Ram","Delhi");
		System.out.println(" First object "+ st.id +st.name +st.city);
		System.out.println("Number of object created: " +Student.count);
		
		Student st1= new Student(2,"Raj","Del");
		System.out.println(" Second object "+ st1.id +st1.name +st1.city);
		System.out.println("Number of object created: " +Student.count);
		
		Student st2= new Student(3,"Raju","Mumbai");
		System.out.println(" Third object "+ st2);
		System.out.println("Number of object created: " +Student.count);
	
	}

}
