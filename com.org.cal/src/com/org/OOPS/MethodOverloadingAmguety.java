package com.org.OOPS;

class multiplication
{
int mul(int a, int b)
{
return a+b;
}
//***********Compiler not able to decide due to amguety***************
double mul(int a, double b)
{
return a+b;
}
//double mul(double a, int b)
//{
//return a+b;
//}
}
public class MethodOverloadingAmguety
{
public static void main(String[] args) {
	multiplication ml= new multiplication();
	System.out.println(ml.mul(22,21));
	System.out.println(ml.mul(22,21.0));
}
}
