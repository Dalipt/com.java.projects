package com.org.staticw;

class Demo4
{
	static int a=10;
	static 
	{
		disp();
		System.out.println("Static block start");
	}
public static void disp()
{
	System.out.println(a);
}
}


public class StaticVar {

	public static void main(String[] args) {
		Demo4.disp();
		Demo4 d1 = new Demo4();
		d1.disp();
	}

}
