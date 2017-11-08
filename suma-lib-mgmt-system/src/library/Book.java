package library;

import java.util.Scanner;

public class Book {
	
	
	public String bookname;
	public String typeofbook;
	public String bookid;
	public String authorname;
	public String edition;
	
	public void getbookdetails()
	{
		System.out.println("Librarian will ask wether student want study book or refference book \n");
		Scanner input=new Scanner(System.in);
		typeofbook=input.next();
		System.out.println("Enter the book name \n");
		Scanner input1=new Scanner(System.in);
		bookname=input1.next();
		System.out.println("Enter the author name \n");
		Scanner input2=new Scanner(System.in);
		authorname=input2.next();
		System.out.println("Enter the edition no. \n");
		Scanner input3=new Scanner(System.in);
		edition=input3.next();
	
	}
	
	
	public void typeofbook()
	{
	
	}
	
	class Refferecebook extends Book 
	{
		public String bookname;
		
		public void typeofbook()
		{
		
		}
		
		public void search() 
		{
		
		}
	}
	class Studybook extends Book
	{
		public String bookname;
		public String authorname;
		public int edition;
		
		public void typeofbook()
		{
		
		}
		
		public void search()
		{
		
		}
	}
}
