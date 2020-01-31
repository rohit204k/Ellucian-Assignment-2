public class AvgSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int es=0,os=0,en=0,on=0;
		double ea=0,oa=0;
		if(args.length==0)
		{
			System.out.println("No Input");
			return;
		}
		for(int i=0;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			if(x%2==1) {
				os+=x;
				on++;
			}
			else {
				es+=x;
				en++;
			}
		}
		ea=(float)es/en;
		oa=(float)os/on;
		
		System.out.println("Sum and Average of even numbers are ");
		System.out.println("Sum = "+es+" Average = "+ea+"\n"+en);
		
		System.out.println("Sum and Average of odd numbers are ");
		System.out.println("Sum = "+os+" Average = "+oa);
	}

}
