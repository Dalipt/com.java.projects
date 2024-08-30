package com.org.OOPS;
class Finisher
{
	int id;
	String name;
	String city;
	public Finisher() {
		super();
		System.out.println("No param constructor");
	}
	public Finisher(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}



public class ConstructorInje {

	public static void main(String[] args) {
		
		Finisher f1= new Finisher();
		f1.setId(1);
		f1.setName("Amit");
		f1.setCity("Delhi");
		System.out.println(f1.getId());
		System.out.println(f1.getName());
		System.out.println(f1.getCity());
		
		System.out.println("***********************");
		
		Finisher f2= new Finisher(2,"Amit","Amritsar");
		System.out.println(f2.getId());
		System.out.println(f2.getName());
		System.out.println(f2.getCity());
		
		f2.setId(3);
		f2.setName("Naman");
		f2.setCity("Mohali");
		System.out.println(f2.getId());
		System.out.println(f2.getName());
		System.out.println(f2.getCity());
	}

}
