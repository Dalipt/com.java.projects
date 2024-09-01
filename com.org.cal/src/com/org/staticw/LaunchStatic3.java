package com.org.staticw;

class StBlock
{
	static 
	{
		System.out.println("Static block 1");
	}
	static 
	{
		System.out.println("Static block 2");
	}

	{
		System.out.println("INit block 1");
	}
	{
		System.out.println("Init block 2");
	}
}
public class LaunchStatic3 {

	public static void main(String[] args) 
	{
		StBlock st= new StBlock();
		
		StBlock st1= new StBlock();
	}

}
