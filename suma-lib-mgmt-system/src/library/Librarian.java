package library;
import java.util.*;


public class Librarian {
	Scanner scan = new Scanner(System.in);
	public String name;
	Student s1 = new Student();
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.Borrow();
		Librarian l1= new Librarian();
	    l1.getsid();
	    Sturec c1 = new Sturec();
	    c1.updatesturec();
	    l1.fetchsturec();
	    l1.verify();
	  
	}

	public void getsid() {
	System.out.println("Librarian Ask the student to enter his sid \n");
	s1.givesid();
	}
	
	public void fetchsturec() {
		
		 
	}
	public void verify() 
	 {  
		int n;
		System.out.println("Enter the number of books borrowed \n");
		n=Integer.parseInt(scan.nextLine());
		System.out.println("Librarian will verify the student record \n");
		
		if(n<4) 
		{
			System.out.println("The number of books borrowed is less then 4 \n Librarian will get the details of the books  that the student need to borrow \n");
			Librarian l1 = new Librarian();
			l1.getbookdetails();
			l1.search();
			l1.issuebook();
			l1.updatebookrec();
		}
		else 
		{
			System.out.println("Librarian will tell the student the requirement is exeeded cant issue the book \n");
		}
		
		}
		
		
	public void getbookdetails() {
		Book b = new Book();
		b.getbookdetails();
	
	}
	
	public void search()
	{
		System.out.println("Librarian will search for the book based on the book details given by the student \n");
	
	}
	
	public void issuebook() 
	{
	System.out.println(" If the book is found , Librarian will issue the book to the student \n ");
	}
	
	public void generatebill() {
	
	}
	
	public void updatebookrec() {
	System.out.println("Librarian will update the book rec and student rec after issuing the book \n");
	}
}


