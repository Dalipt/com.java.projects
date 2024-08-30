package com.org.OOPS;

class Calculator
{
 int add(int a, int b)
 {
	 return a+b;
 }
 int add(int a, int b,int c)
 {
	 return a+b+c;
 }
 double add(int a, double b)
 {
	 return a+b;
 }
 double add(double a, double b)
 {
	 return a+b;
 }
 double add(double a, double b, double c)
 {
	 return a+b+c;
 } 
}
public class LaunchMethodOverloading {

	public static void main(String[] args) {
	
	int a=10;
	int b=23;
	int c=43;
	double d=20.00;
	double d1=30.00;
	double d2=10.50;
	Calculator clk= new Calculator();
	System.out.println(clk.add(a,b));
	System.out.println(clk.add(d, d1));
	System.out.println(clk.add(a, d2));
	System.out.println(clk.add(d, d1, d2));
	System.out.println(clk.add(a, b, c));
	}
}
