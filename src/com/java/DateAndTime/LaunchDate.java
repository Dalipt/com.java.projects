package com.java.DateAndTime;

import java.util.Date;

//import java.util.Date;
//All older I don't think anyone can be using
public class LaunchDate {

	public static void main(String[] args) {
		//Date ->util and SQL deprecated
		//From Java 8 onward Joda API comes >>new date time api-->time package 
		
		Date d= new Date();
		d.getDate();
		System.out.println(d);
		int d1=d.getMinutes();
		System.out.println(d1);
		int d2=d.getMonth();
		System.out.println(d2);
		Date d6= new Date();
		d6.setYear(2024);
		System.out.println(d6);
		
		

	}

}
