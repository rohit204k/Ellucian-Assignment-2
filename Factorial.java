//import java.util.*;
public class Factorial {
	int n;
	
	static int factorial(int n)
	{
		if(n==0||n==1)
			return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("No Input");
			return;
		}
		int n=Integer.parseInt(args[0]);
		int result=factorial(n);
		System.out.println("Factorial of "+n+" is = "+result);
		//s.close();
	}

}
