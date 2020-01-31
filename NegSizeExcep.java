import java.util.*;

class NegativeSizeException extends Exception 
{ 
    public NegativeSizeException(String s) 
    { 
        super(s); 
    } 
} 
  
public class NegSizeExcep 
{ 
    public static void main(String args[]) 
    { 
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 10 Values");
        try
        { 	
        	
        	for(int i=0;i<10;i++)
        	{	
        		a[i]=sc.nextInt();
        		if(a[i]<0)
        			throw new NegativeSizeException("Negative Value Entered"); 
        	}
        } 
        catch (NegativeSizeException ex) 
        { 
            System.out.print("Exception Caught : "); 
            System.out.println(ex.getMessage()); 
        }
        finally {
        sc.close();
        }
    } 
} 