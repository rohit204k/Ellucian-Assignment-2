//import java.util.*;
public class CalcIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("No Input");
			return;
		}
		int sal=Integer.parseInt(args[0]);
		int ea;
		double it=0;
		System.out.print("Income Tax is ");
		if(sal<50000) {it=0;}
		else if(sal>50000 && sal<=60000) {
			ea=sal-50000;
			it=0.1*ea;
		}	
		else if(sal>60000 && sal<=150000) {
			ea=sal-60000;
			it=0.2*ea;
		}
		else if(sal>150000){
			ea=sal-150000;
			it=0.3*ea;
		}
		System.out.println(it);
	}
}
