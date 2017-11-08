package library;

import java.util.Scanner;

public class Sturec {
	 String sid;
	 String sname;
	public String sno;
	public String semail;
	public String issueddate;
	public String returndate;
	
	 int n;
	
	Scanner scan = new Scanner(System.in);
	
	public void updatesturec() 
	{
		System.out.println("librarian Update student record \n");
		System.out.println("Enter the Sid : \n");
		Scanner input1=new Scanner(System.in);
		sid =input1.next();
		System.out.println("Enter the sname: \n");
		Scanner input2=new Scanner(System.in);
		sname=input2.next();
		System.out.println(" Enter the mobile number \n");
		Scanner input3=new Scanner(System.in);
		sno=input3.next();
		System.out.println("Enter the semail \n");
		Scanner input4=new Scanner(System.in);
		semail=input4.next();
		System.out.println("Enter the No. of books borrowed \n");
		n=Integer.parseInt(scan.nextLine());
		String booksborrowed[] = new String[n];
		for(int i=0; i<booksborrowed.length; i++)
		{	
		System.out.println("enter the books borrowed" + (i+1) + " :");
		booksborrowed[i] = scan.nextLine();
		}
		
		
		String issueddate[] = new String[n];
		for(int i=0; i<issueddate.length; i++)
		{	
		System.out.println("enter the book" + (i+1) + " issued date:");
		issueddate[i] = scan.nextLine();
		}
		
		String returndate[] = new String[n];
		for(int i=0; i<returndate.length; i++)
		{	
		System.out.println("enter the book" + (i+1) + " return date:");
		returndate[i] = scan.nextLine();
		}
		System.out.println("Librarian will fetch the student record \n");
		System.out.println("Student by name \t" +sname+ "\t with sid\t" +sid+ "\t borrowed \t" +n+ "\t books \t");
		
		
	}
	
}
