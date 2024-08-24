package com.java.project;

public class LoopBasic {

	public static void main(String[] args) {

	int n=11;
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j==0 || j==n-1|| i==0|| i==(n-1)/2)//==H
			//if(i==0||j==(n-1)/2||i==n-1)==I
			//if(j==0||i==0||i==(n-1)/2||i==n-1)==E
			//if(j==0||i==0||i==n-1)==c
			//if(j==0||i==0||i==n-1||j==n-1)==O
			//if(i==0 && j>0 || i==n-1 &&j>0 || j==0 && i>0 && i<n-1)===Proper c
			//if(i==(n-1)/2||i==0 && j>0 && j<n-1 || j==0 && i>0 ||j==n-1 &&i>0) ==Proper A
			{
				System.out.print("*");	
			}else
			{
				System.out.print(" ");
		}}
		System.out.print("  ");
		for(int j=0;j<n;j++)
		{
			//if(j==0 || j==n-1|| i==0|| i==(n-1)/2)//==H
			if(i==0||j==(n-1)/2||i==n-1)//==I
			//if(j==0||i==0||i==(n-1)/2||i==n-1)==E
			//if(j==0||i==0||i==n-1)==c
			//if(j==0||i==0||i==n-1||j==n-1)==O
			//if(i==0 && j>0 || i==n-1 &&j>0 || j==0 && i>0 && i<n-1)===Proper c
			//if(i==(n-1)/2||i==0 && j>0 && j<n-1 || j==0 && i>0 ||j==n-1 &&i>0) ==Proper A
			{
				System.out.print("*");	
			}else
			{
				System.out.print(" ");
		}}
		System.out.print("  ");
		for(int j=0;j<n;j++)
		{
			//if(j==0 || j==n-1|| i==0|| i==(n-1)/2)//==H
			//if(i==0||j==(n-1)/2||i==n-1)//==I
			if(j==0||i==0||i==(n-1)/2||i==n-1)//==E
			//if(j==0||i==0||i==n-1)==c
			//if(j==0||i==0||i==n-1||j==n-1)==O
			//if(i==0 && j>0 || i==n-1 &&j>0 || j==0 && i>0 && i<n-1)===Proper c
			//if(i==(n-1)/2||i==0 && j>0 && j<n-1 || j==0 && i>0 ||j==n-1 &&i>0) ==Proper A
			{
				System.out.print("*");	
			}else
			{
				System.out.print(" ");
		}}
		System.out.println("  ");
	}
	System.out.println("===========================================");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			//if(j==0 || j==n-1|| i==0|| i==(n-1)/2)//==H
			//if(i==0||j==(n-1)/2||i==n-1)==I
			//if(j==0||i==0||i==(n-1)/2||i==n-1)==E
			if(j==0||i==0||i==n-1)//==c
			//if(j==0||i==0||i==n-1||j==n-1)==O
			//if(i==0 && j>0 || i==n-1 &&j>0 || j==0 && i>0 && i<n-1)===Proper c
			//if(i==(n-1)/2||i==0 && j>0 && j<n-1 || j==0 && i>0 ||j==n-1 &&i>0) ==Proper A
			{
				System.out.print("*");	
			}else
			{
				System.out.print(" ");
		}}
		System.out.print("  ");
		for(int j=0;j<n;j++)
		{
			//if(j==0 || j==n-1|| i==0|| i==(n-1)/2)//==H
			//if(i==0||j==(n-1)/2||i==n-1)//==I
			//if(j==0||i==0||i==(n-1)/2||i==n-1)==E
			//if(j==0||i==0||i==n-1)==c
			if(j==0||i==0||i==n-1||j==n-1)//==O
			//if(i==0 && j>0 || i==n-1 &&j>0 || j==0 && i>0 && i<n-1)===Proper c
			//if(i==(n-1)/2||i==0 && j>0 && j<n-1 || j==0 && i>0 ||j==n-1 &&i>0) ==Proper A
			{
				System.out.print("*");	
			}else
			{
				System.out.print(" ");
		}}
		System.out.print("  ");
		for(int j=0;j<n;j++)
		{
			//if(j==0 || j==n-1|| i==0|| i==(n-1)/2)//==H
			//if(i==0||j==(n-1)/2||i==n-1)//==I
			//if(j==0||i==0||i==(n-1)/2||i==n-1)//==E
			//if(j==0||i==0||i==n-1)==c
			//if(j==0||i==0||i==n-1||j==n-1)==O
			if(i==0 && j>0 || i==n-1 &&j>0 || j==0 && i>0 && i<n-1)//===Proper c
			//if(i==(n-1)/2||i==0 && j>0 && j<n-1 || j==0 && i>0 ||j==n-1 &&i>0) ==Proper A
			{
				System.out.print("*");	
			}else
			{
				System.out.print(" ");
		}}

	System.out.println(" ");
	}
	}	
}

