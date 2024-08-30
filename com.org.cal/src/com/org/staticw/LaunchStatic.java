package com.org.staticw;

public class LaunchStatic {
	
	static int a;
	static void Demo()
	{
		System.out.println(a);
	}
	static
	{
 		int a=10;
		System.out.println("Static block:" + a);
	}
	
	public static void main(String[] args) 
	{
	
	LaunchStatic.Demo();
	}

}
