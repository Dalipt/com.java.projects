package com.org.OOPS;
class Demo
{
	int num1, num2;
Demo()
{	
	super();
	System.out.println("Zero Parameter Constructor");	
}
Demo(int num1)
{
	this.num1=num1;
	num2=22;
	System.out.println("One Param constructor");
}
Demo(int num1,int num2)
{	this(num1);
	this.num1=num1;	
	this.num2=num2;
	System.out.println("2 param constructor");
}
void Display()
{
	System.out.println("Num1 is "+num1);	
	System.out.println("Num2 is "+num2);	
}
}
public class LaunchConstruc3 {

	public static void main(String[] args) 
	{
//		Demo d1=new Demo(4);
//		d1.Display();
		System.out.println("************");
		Demo d3=new Demo(4,34);
		d3.Display();
		
	}

}
