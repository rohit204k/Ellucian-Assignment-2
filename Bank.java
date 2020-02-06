import java.util.*;

public class Bank {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a=null;
		int i=0;
		while(i!=5)
		{
			System.out.println("\n 1) Add Account details");
			System.out.println(" 2) Withdraw");
			System.out.println(" 3) Deopsit");
			System.out.println(" 4) View Balance");
			System.out.println(" 5) Exit");	
			System.out.print("\nEnter an option : ");
			
			i=sc.nextInt();
				
			switch(i)
			{
				case 1: a=addDetails();
						break;
				case 2: if(a==null)
						{
							System.out.println("Add the account details first.");
							break;
						}
						System.out.println("Enter withdraw amount");
						int am=sc.nextInt();
						a.withdraw(am);
						break;
				case 3: if(a==null)
						{
							System.out.println("Add the account details first.");
							break;
						}
						System.out.println("Enter Deposit amount");
						int amm=sc.nextInt();
						a.deposit(amm);
						break;						
				case 4: if(a==null)
						{
							System.out.println("Add the account details first.");
							break;
						}
						a.display();
						break;
				case 5: break;
				default:System.out.println("Invalid Option\n");
						break;
			}
		}
	}
	
	static Account addDetails()
	{
		System.out.print("Enter Account Holder's Name : ");
		String fn=sc.next();
		System.out.print("Enter Account Number : ");
		int s=sc.nextInt();
		System.out.print("Enter Account type (Saving,Current) : ");
		String h=sc.next();
		Account m=new Account(fn,h,s);
		return m;
	}

}

class Account{
	String name;
	int accNo;
	String accType;
	int balance;
	
	Account(String n,String aT,int aN){
		name=n;
		accType=aT;
		balance=0;
		accNo=aN;
	}
	
	void deposit(int depo)
	{
		balance+=depo;
		System.out.println("Rs "+depo+"/- credited to acc no. :"+accNo+"\n");
		
	}
	
	void withdraw(int with)
	{
		if ((balance-with)<0)
		{
			System.out.println("Insufficient Funds");
			return;
		}
		balance-=with;
		System.out.println("Rs "+with+"/- debited from acc no. :"+accNo);
	}
	void display()
	{
		System.out.println("Balance : Rs"+balance+"/-\n");
	}
	
}

