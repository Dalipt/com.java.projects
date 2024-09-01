package com.org.staticw;
import java.util.*;
class carLoan
{
	int amount;
	int time;
	static float interest;
	
	static 
	{
		interest=2.5f;	
	} 
	void CarLoan()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter amount required:");
		amount =sc.nextInt();
		System.out.println("Please select number of month for repay:");
		time=sc.nextInt();
	}
	void Carcalculate()
	{
		interest =(amount*time*interest)/100;		
	}
	void cardisplay()
	{
		System.out.println("  ");
		System.out.println("Your simple Interest for car Loan is : " + interest);
		System.out.println("Your Car Loan application end here");
		System.out.println("************************");
	}
}
class HomeLoan
{
	int amount;
	int time;
	static float inter;
	
	static 
	{
		inter=8.5f;	
	} 
	void HomLoan()
	{
		System.out.println("Please Enter amount required:");
		Scanner sc= new Scanner(System.in);
		amount=sc.nextInt();
		System.out.println("Please select number of month for repay:");
		time=sc.nextInt();
	}
	void Homecalculate()
	{
		inter =(amount*time*inter)/100;		
	}
	void Homedisplay()
	{
		System.out.println("  ");
		System.out.println("Your simple Interest for Home Loan is : " + inter);
		System.out.println("Your Home Loan application end here");
	}
}
class PersenalLoan
{
	int amount;
	int time;
	static float interest;
	
	static 
	{
		interest=12.5f ;	
	} 
	void PersnalLoan()
	{
		System.out.println("Please Enter amount required");
		Scanner sc= new Scanner(System.in);
		amount=sc.nextInt();
		System.out.println("Please select number of month for repay:");
		time=sc.nextInt();
	}
	void Percalculate()
	{
		interest =(amount*time*interest)/100;		
	}
	void Perdisplay()
	{
		System.out.println("  ");
		System.out.println("Your simple Interest for Personal Loan is : " + interest);
		System.out.println("Your Percenal Loan application end here");
		System.out.println("************************");
	}
}
public class LoanManagement {

	public static void main(String[] args) 
	{
	System.out.println("Please select type of loan required: ");
	carLoan n1= new carLoan();
	HomeLoan hm= new HomeLoan();
	PersenalLoan pl= new PersenalLoan();
	if (hm.equals(pl))
	{
	}else
	{
		System.out.println("user selected for Personal Loan:");
		pl.PersnalLoan();
		pl.Percalculate();
		pl.Perdisplay();	
	}
	System.out.println();
	if (hm.equals(pl))
	{
	}
	else 
	{
		System.out.println("user selected for CarLoan :");
		n1.CarLoan();
		n1.Carcalculate();
		n1.cardisplay();
	}
	if (n1.equals(pl))
	{
	}
	else 
	{
	System.out.println("user selected for HomeLoan :");
	hm.HomLoan();
	hm.Homecalculate();
	hm.Homedisplay();
	}
//	LoanManagement n3= new LoanManagement();
//	PersenalLoan pl= new PersenalLoan();
//	pl.equals(n3);
//	System.out.println("You total Interest is :" + n3) ;
	
//	n1.CarLoan();
//	n1.Carcalculate();
//	n1.display();
	
	
//	hm.HomeLoan();
//	hm.Carcalculate();
//	hm.display();
	//System.out.println("You total Interest is :" + hm) ;
	
	
//	pl.PersnalLoan();
//	pl.Carcalculate();
//	pl.display();
	//System.out.println("You total Interest is :" + hm) ;
	

	}

}
