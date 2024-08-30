package com.org.staticw;
class Demo
{
	static int a,b,c;	
	int x,y,z;
	static
	{
		a=10;
		b=20;
		c=30;
		System.out.println("Static block Execution");
		System.out.println("Value of a is :"+a);
		System.out.println("Value of b is :"+b);
		System.out.println("Value of c is :"+c);
	}
	static void display()
	{
		System.out.println("Static method started");
		System.out.println("Value of a is :"+a);
		System.out.println("Value of b is :"+b);
		System.out.println("Value of c is :"+c);
	}
	{
		System.out.println(" instance Init block");
		x=5;
		y=7;
		z=9;
	}
	Demo()
	{
		System.out.println("Constructor excecution start");
	}
	void display1()
	{
		System.out.println("Display1 method started");
		System.out.println("Value of x is :"+x);
		System.out.println("Value of y is :"+y);
		System.out.println("Value of z is :"+z);
	}
}



public class LaunchStatic1 {

	public static void main(String[] args) {
		
		Demo.display();
		Demo d1= new Demo();
		d1.display1();
	}

}
