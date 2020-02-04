import java.util.*;
public class EmployeeClass {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Employe e = null;
		while(i!=3)
		{
			System.out.println(" 1) Add Employee details");
			System.out.println(" 2) View Pay details");
			System.out.println(" 3) Exit");
			System.out.print("\nEnter an option : ");
			
			i=sc.nextInt();
			switch(i)
			{
				case 1: e=employeeadd();
						break;
				case 2: paydisplay(e);
						break;
				case 3: break;
				default:System.out.println("Invalid Option\n");
						break;
			}
		}
		
	}
	
	public static Employe employeeadd()
	{
		System.out.print("Enter Employee's First Name : ");
		String fn=sc.next();
		System.out.print("Enter Employee's Last Name : ");
		String ln=sc.next();
		System.out.print("Enter Employee's Initial Salary : ");
		int s=sc.nextInt();
		System.out.print("Enter Employee's Joining year (YYYY) : ");
		int h=sc.nextInt();
		Employe m=new Employe(fn,ln,s,h);
		System.out.println("\nDetails of the Employee-");
		display(m);
		return m;
	}
	
	static void paydisplay(Employe m)
	{
		if(m==null)
		{
			System.out.println("Enter the details of the employee first\n");
			return;
		}
		calculate(m);
		System.out.println("\nSalary of the employee is = Rs "+m.salary+"/-");
		System.out.println("PF of the employee is = Rs "+m.pf+"/-");
		System.out.println("Allowance of the employee is = Rs "+m.allowance+"/-\n");
		return;
	}

	public static Employe calculate(Employe ob)
	{ 
		int exp=(2020-ob.hireYear);
		ob.salary += (0.02*exp)*ob.salary;
		ob.pf=ob.salary*exp*0.015;
		ob.allowance=15000;
		return ob;
	}
	public static void display(Employe ob)
	{
		System.out.println("Name: "+ob.fname + " " +ob.lname +"\nJoining Year: "+ ob.hireYear+"\n");
	}
}




class Employe
{ 
	
	public Employe(String fn,String ln,double s,int year)
	{ 
		fname = fn;
		lname = ln;
	 	salary = s;
	 	hireYear = year;
	}
	
	public Employe(Employe ob)
	{
		fname = ob.fname;
		lname = ob.lname;
	 	salary = ob.salary;
	 	hireYear = ob.hireYear;
	}
	
	 String fname;
	 String lname;
	 double salary;
	 double pf;
	 double allowance;
	 int hireYear;
}
