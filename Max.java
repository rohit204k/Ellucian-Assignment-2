public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=Integer.parseInt(args[0]);
		if(args.length==0)
		{
			System.out.println("No Input");
			return;
		}
		for(int i=1;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			if(max<x)
				max=x;
		}
		System.out.println("Max = "+max);
	}

}
