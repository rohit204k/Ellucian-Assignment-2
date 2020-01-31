import java.util.*;
class DateClass{
	int date,month;
	static final int ref[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	DateClass()
	{
		date=1;
		month=1;
	}
	
	boolean setdate(int d,int m)
	{
		if(m>=0 && m<12)
		{
			if(d>=1 && d<=ref[m])
			{
				date=d;
				month=m;
				return true;
			}
		}
		return false;
	}
	void display()
	{
		if(date<ref[month]) {
			date++;
			System.out.printf("%02d-%02d\n",date,month+1);
		return;
		}
		else {
			month++;
			if(month==12)
				month=0;
			date=1;
			System.out.printf("%02d-%02d\n",date,month+1);
			return;
		}
	}

}
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DateClass d=new DateClass();
		int i=0;
		while(i!=3)
		{
			System.out.println("\n1)Enter the date");
			System.out.println("2)Display the next date");
			System.out.println("3)Exit");
			System.out.print("Select an option : ");
			i=sc.nextInt();
			
			switch(i) {
				
			case 1: boolean x=false;
					while(!x)
					{
						System.out.print("Enter date : ");
						int da=sc.nextInt();
						System.out.print("Enter month : ");
						int m=sc.nextInt();
						m--;
						x=d.setdate(da,m);
					}
					break;
			case 2: System.out.print("\nNext Date is :  ");
					d.display();
					break;
			case 3: break;
			default:System.out.println("Invalid Input");
					break;
			}
		}
		sc.close();
	}

}
