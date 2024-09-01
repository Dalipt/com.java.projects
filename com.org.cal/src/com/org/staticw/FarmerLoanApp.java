package com.org.staticw;
import java.util.*;
class LoanTaker
{
	float pa;
	float time;
	float roi;
	static float si;
	/*Static variable memory will get allocated only once in heap area during class loading. When ever we have
	common copy of data that needs to get shared amongst all objects of class then we must use static variable as memory will get
	allocated only once and shame copy of data will get shared amongst all Object of class*/
	public void AcceptInput()
	/* Static variable memory will be allocated on heap area during class loading itself(class loading subsystem > Linking >Preperation)
	* JVM initialize default to all static variables at this stage  */
	/*Static block will be executed during class loading it self (class loading > initialization) */
	/*IF there are few statement that need to be excuted even before main method we can use them in static block*/
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Kindly enter loan amount in ruppes:");
		pa=sc.nextFloat();
		System.out.println("Kindly provide time to repay the Loan in months:");
		time=sc.nextFloat();
	}
	/*Java Initilazition block will get executed during the object creation before the body of constructor execution*/
	{
		roi=2.5f;
	}
	void compute()
	{
		si=(pa*roi*time)/100.0f;
	}
	void display()
	{
		System.out.println("Your Simple Interest is: " +si);
	}
}

/*Static method can be invoked directly using class name and with using object reference also*/
/*When ever we have a common java statement that is getting executed in every constructor we can write that in Instance initialization block(java block)*/
/*Instance initialization block can be used to initialze the instance variable*/
public class FarmerLoanApp {

	public static void main(String[] args) 
	{
	LoanTaker lt= new LoanTaker();
	System.out.println("Farmer 1 information:");
	lt.AcceptInput();
	lt.compute();
	lt.display();
	LoanTaker lt1= new LoanTaker();
	System.out.println("Farmer 2 information:");
	lt1.AcceptInput();
	lt1.compute();
	lt1.display();
	LoanTaker lt2= new LoanTaker();
	System.out.println("Farmer 2 information:");
	lt2.AcceptInput();
	lt2.compute();
	lt2.display();
	}

}
