package com.org.OOPS;

class Book
{
	private int pageNum;
	void setPageNumber(int pgnum)
	{
		if(pgnum>=0)
		{	
		   pageNum = pgnum;
		}
		else
		{
			System.out.println("Please add Page number in NON-Zero "+pgnum);
		}
		}
	int getPageNumber()
	{
		return pageNum;
	}
	void pageNumber()
	{
		System.out.println("This is user page number"+pageNum);
	}
}


public class LaunchEnc {

	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.setPageNumber(44);
		System.out.println(b1.getPageNumber());
		b1.pageNumber();
	}

}
