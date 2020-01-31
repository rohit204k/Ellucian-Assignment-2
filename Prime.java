public class Prime {

	static boolean isPrime(int n)
	{
		int i;
		int flag=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
				flag=1;
				break;
		}
		if(flag==1)
		{
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("No Input");
			return;
		}
		System.out.println("Prime numnbers are: ");
		for(int j=0;j<args.length;j++) {
			int x=Integer.parseInt(args[j]);
			if(isPrime(x))
				System.out.print(x+" ");
		}	
	}
}
