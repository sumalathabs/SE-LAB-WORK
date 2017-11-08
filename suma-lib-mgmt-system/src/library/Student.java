package library;
import java.util.Scanner;

public class Student 
{

	public String Sname;
	public String Sid;
	public String depname;
	
	public void Borrow() 
	{
	System.out.println("Student ask the librarian for issuing the Book \n");
	}
	
	public void givesid()
	{
		Scanner input=new Scanner(System.in);
		Sid=input.next();
		
	
	}
	
	public void givebookdetails() {
	
	}
	
	public void returnbook() {
	
	}
	
	public void payfine() {
	
	}
	
	public void reneeval() {
	
	}
}
