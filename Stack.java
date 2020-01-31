import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StackClass st=new StackClass();
		int i=0;
		while(i!=4)
		{
			System.out.println("\nStack Operations");
			System.out.println("1) Push");
			System.out.println("2) Pop");
			System.out.println("3) Display");
			System.out.println("4) Exit");
			System.out.print("Choose an option : ");			
			i=s.nextInt();
			
			switch(i) {
			case 1:System.out.print("Enter the element : ");
					int y=s.nextInt();
					st.push(y);
					break;
			case 2: int x=st.pop();
					if(x!=-1)
					System.out.println("Popped Element is = "+x);
					break;
			case 3: st.display();
					break;
			case 4: System.out.println("Invalid Input");
					break;
			}
		}
		s.close();
	}

}

class StackClass{
	static final int MAX=1000;
	private int top;
	private int a[]=new int[MAX];
	public StackClass()
	{
		System.out.println("Stack Created");
		top=-1;
	}
	public void push(int ele)
	{
		if(top==MAX)
		{
			System.out.println("Stack Full");
			return;
		}
		a[++top]=ele;
		System.out.println(ele+" pushed");
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
			return -1;
		}
		return a[top--];
	}
	
	public void display()
	{
		int i;
		if(top==-1) {
				System.out.println("Stack is empty");
				return;
		}
		System.out.println("Contents of the stack:");
		for(i=top;i>=0;i--)
			System.out.println(a[i]);
	}
}
