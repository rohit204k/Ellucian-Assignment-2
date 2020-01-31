public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("No Input");
			return;
		}
		int n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.print("\n");
		}
	}
}
