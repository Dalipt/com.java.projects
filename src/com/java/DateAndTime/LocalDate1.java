package com.java.DateAndTime;
import java.time.*;

/*So Mainly LocalDate and LocalTime are two immutable class having 
 * multiple useful method to use with
 * Due to Immutable class we need no to create object */

public class LocalDate1 {

	public static void main(String[] args)
	{
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		int ss=ld.getDayOfMonth();
		System.out.println(ss);
		int fg=ld.getDayOfYear();
		System.out.println("Day of year"+ fg);
		
		//Customizing date and time
		LocalDate ld2= LocalDate.of(2024, 12, 31);//Here compile time no error if you set wrong but runtime we get date time exception 
		System.out.println(ld2);
		LocalTime in=LocalTime.now();
		System.out.println(in);
	}

}
