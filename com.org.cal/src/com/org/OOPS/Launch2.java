package com.org.OOPS;

class Cal
{
 int num1;
 int num2, res;
//
//void add()
//{
//	num1=10;
//	num2=30;
//	int res=num1+num2;
//	System.out.println("Addition is "+ res);
//}
// void add(int a, int b)
// {
////	 num1= a;
////	 num2= b;
//	 res=a+b;
//	 System.out.println("Result is "+res);
// }
//int add()
//{	
//	 num1=10;
//	 num2=25;
//	 res=num1+num2;
//	 System.out.println("Result is "+res);
//	 return res;
//}
int add(int a, int b)
{
	res=a+b;
	return res;
}}
public class Launch2 
{
public static void main(String[] args)
{
	Cal ca=new Cal();
	//ca.add(10,4);
	//int res=ca.add();
	int res=ca.add(30, 39);
	System.out.println("Result is" +  res);
}
}