import java.util.*;
public class InputCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String ip=sc.next();
		char x[]=ip.toCharArray();
		char y;
		int dig=0;
		for(int i=0;i<ip.length();i++)
		{
			y=x[i];
			if(65<=y&& y<=90)
				System.out.println(y+" is an UPPERCASE letter");
			else if(97<=y && y<=122)
				System.out.println(y+" is an LOWERCASE letter");
			else if(48<=y && y<=57)
				dig++;
			else 
				System.out.println(y+" is some other character");
		}
		System.out.println("Number of digits = "+dig);
	}

}
