package com.java.project;

public class Loop3 {

	public static void main(String[] args) 
	{
		int n=5;
		
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(j==0 ||j==n-1 || i==(n-1)/2 )===H
				//if(i==0 || j==(n-1)/2)==T
				//if(i==0 || j==0 ||i==(n-1)/2 || j==(n-1)/2)//==F
				//if(j==0 || i==0 ||i==(n-1)/2 ||i==(n-1) )===E
				//if(i==0 ||j==0|| i==(n-1)/2|| j==(n-1))==A
				if(i==0 && j>0 || i==n-1 && j>0||j==0 && i>0 && i<n-1)
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	}
