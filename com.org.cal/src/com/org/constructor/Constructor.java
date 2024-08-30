package com.org.constructor;

class Demo
{
int num, num1;	

Demo()
{
	super();
	System.out.println("Construcor of 0 param");
}
Demo(int num, int num1)
{
    this(num);
	this.num=num;
	this.num1=num1;
	System.out.println("Constructor of 2 param");
}
Demo(int num)
{
this();
this.num=num;
num1=10;
System.out.println("Constructor of 1 param"+num1);
}
void Display()
{
System.out.println(" Output is"+ num);
System.out.println(" Output is"+ num1);
}
}
public class Constructor {

	public static void main(String[] args) {
		Demo dm= new Demo(4,5);
		dm.Display();
		
	}
}
