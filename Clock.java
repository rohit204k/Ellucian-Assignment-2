import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ClockClass c=new ClockClass();
		int i=0;
		while(i!=3)
		{
			System.out.println("\n1)Enter the time");
			System.out.println("2)Display the time");
			System.out.println("3)Exit");
			System.out.print("Select an option : ");
			i=s.nextInt();
			
			switch(i) {
				
			case 1: boolean x=false;
					while(!x)
					{
						System.out.print("Enter hours : ");
						int h=s.nextInt();
						if(!(1<=h && h<=12))
						{
							System.out.println("Hour value is not correct");
							continue;
						}
						System.out.print("Enter Minutes : ");
						int m=s.nextInt();
						if(!(1<=m && m<=60))
						{
							System.out.println("Minute value is not correct");
							continue;
						}
						System.out.print("Enter Seconds : ");
						int sec=s.nextInt();
						if(!(1<=sec && sec<=60))
						{
							System.out.println("Seconds value is not correct");
							continue;
						}
						System.out.print("Enter am or pm : ");
						String ap=s.next();
						if(!(ap.compareTo("am")==0 || ap.compareTo("pm")==0))
						{
							System.out.println("Please enter either am or pm only");
							continue;
						}
						x=c.settime(h, m, sec,ap);
					}
					break;
			case 2: System.out.print("\nTime is :  ");
					c.display();
					break;
			case 3: break;
			default:System.out.println("Invalid Input");
					break;
			}
		}
		s.close();
	}
}

class ClockClass{
	int hours,minutes,seconds;
	String ampm;
	
	ClockClass()
	{
		hours=0;
		minutes=0;
		seconds=0;
		ampm="am";
	}
	
	boolean settime(int h,int m,int s,String ap)
	{
		hours=h;
		minutes=m;
		seconds=s;
		ampm=ap;
		return true;
	}
	void display()
	{
		System.out.printf("%02d:%02d:%02d %s\n",hours,minutes,seconds,ampm);
		return;
	}
}