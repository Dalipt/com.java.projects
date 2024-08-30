package com.org.cal;

import java.util.Scanner;

class Calculator
{
	int a;
	int b;
	int result;
int sum()
{ 
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a+b;
	return result;	
}
int sub()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a-b;
	return result;	
}
int mul()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a*b;
	return result;	
}
int div()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a/b;
	return result;
}
}



public class CalculatorLogic {
	public static void main(String[] args) 
	{
		Calculator cl= new Calculator();
		int res=cl.sum();
		System.out.println("Sum of two number is "+res);
		System.out.println(" ");
		System.out.println("Please enter if you want sub");
		int res1=cl.sub();
		System.out.println("sub of two number is "+res1);
	    }
}


