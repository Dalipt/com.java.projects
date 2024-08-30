package com.org.OOPS;

class Employee
{
	int rollNumber;
	String city;
	String name;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Employee st= new Employee();
		st.setRollNumber(1);
		st.setName("rama");
		st.setCity("Delhi");
		System.out.println(st.getRollNumber());
		System.out.println(st.getCity());
		System.out.println(st.getName());
	}

}
