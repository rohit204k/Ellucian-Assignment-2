import java.util.Scanner;
public class AbsEmployeeClass {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i!=3)
		{
			System.out.println(" 1) Manager");
			System.out.println(" 2) Clerk");
			System.out.println(" 3) Exit");
			System.out.print("\nEnter an option : ");
			
			i=sc.nextInt();
			
			switch(i)
			{
				case 1: manager();
						break;
				case 2: clerk();
						break;
				case 3: break;
				default:System.out.println("Invalid Option\n");
						break;
			}
		}
		
	}
	
	static void manager()
	{
		System.out.print("Enter Manager's First Name : ");
		String fn=sc.next();
		System.out.print("Enter Manager's Last Name : ");
		String ln=sc.next();
		System.out.print("Enter Manager's Initial Salary : ");
		int s=sc.nextInt();
		System.out.print("Enter Manager's Joining year (YYYY) : ");
		int h=sc.nextInt();
		System.out.print("Enter Manager's Department:(MAR,HR,IT,R&D) : ");
		String d=sc.next();
		Manager m=new Manager(fn,ln,s,h,d);
		System.out.println("\nDetails of the manager-");
		m.display();
		System.out.println("Salary of the manager is = Rs "+m.calcSalary()+"/-\n");
		return;
	}
	static void clerk()
	{
		System.out.print("Enter Clerk's First Name : ");
		String fn=sc.next();
		System.out.print("Enter Clerk's Last Name : ");
		String ln=sc.next();
		System.out.print("Enter Clerk's Initial Salary : ");
		int s=sc.nextInt();
		System.out.print("Enter Clark's Joining year (YYYY) : ");
		int h=sc.nextInt();
		System.out.print("Enter Clark's Floor No. :(1-10) : ");
		int f=sc.nextInt();
		System.out.print("Enter Clark's Task:(Typing,Editing,Filing) : ");
		String t=sc.next();
		Clerk c=new Clerk(fn,ln,s,h,t,f);
		System.out.println("\nDetails of the clerk-");
		c.display();
		System.out.println("Salary of the manager is = "+c.calcSalary()+"/-\n");
		return;
	}
}




abstract class Employee
{ 
	public Employee(String fn,String ln,double s,int year)
	{ 
		fname = fn;
		lname = ln;
	 	salary = s;
	 	hireYear = year;
	 	
	}
	abstract double calcSalary();
	public void display()
	{
		System.out.println("Name: "+fname + " " +lname + "\nSalary: " + salary + "\nJoining Year: "+ hireYear);
	}
	
	 String fname;
	 String lname;
	 double salary;
	 int hireYear;
}

class Clerk extends Employee
{

	public Clerk(String fn, String ln, double s, int year,String t,int f) {
		super(fn, ln, s, year);
		Task=t;
		floorNo=f;
		// TODO Auto-generated constructor stub
	}
	int floorNo;
	String Task;
	public void display()
	{
		System.out.println("Name: "+fname + " " +lname + "\nSalary: " + salary + "\nJoining Year: "+ hireYear+"\nFloor No: "+floorNo+"\nTask: "+Task);
	}
	public double calcSalary()
	 { 
		 salary += (0.05*(2020-hireYear))*salary;
		 return salary;
	 }

}

class Manager extends Employee
{

	public Manager(String fn, String ln, double s, int year,String d) {
		super(fn, ln, s, year);
		dept=d;
		// TODO Auto-generated constructor stub
	}
	public double calcSalary()
	 { 
		 salary += ((0.05*(2020-hireYear))*salary)+50000;
		 return salary;
	 }
	public void display()
	{
		System.out.println("Name: "+fname + " " +lname + "\nSalary: " + salary + "\nJoining Year: "+ hireYear+"\nDept: "+dept);
	}
	String dept;
}