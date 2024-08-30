package com.org.OOPS;
class Dog
{
	int cost;
	String name;
	String color;
	Dog(int cost,String name, String color)
	{
		this.cost=cost;
		this.name=name;
		this.color=color;
		
	}
	Dog()
	{
		System.out.println("Zero param");
		cost=200;
		color="Blue";
		name="Desi";
		
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

public class LaunchConstructor
{
public static void main(String[] args)
{
//	Dog d1= new Dog(600,"Sheru","Red");
//	System.out.println(d1.getCost());
//	System.out.println(d1.getColor());
//	System.out.println(d1.getName()); 
	Dog d2= new Dog();
	System.out.println(d2.getColor());
	System.out.println(d2.getCost());
	System.out.println(d2.getName());
}
}
