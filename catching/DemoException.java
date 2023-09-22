package trying.catching;
import java.util.*;

public class DemoException 
{

	public static void main(String[] args) 
	{
//		String s="Suman";
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
     	int c;
     	Sc.close();
		try
		{
			c=a/b;
			System.out.println("The result is "+c);

			
		}
		catch(Exception e)
		{
			System.out.println("the problem is "+e.getMessage());
		}
		
	finally
	{
		System.out.println("Thank you ");
	}
	     
		
		

	}

}




//	for(int i=0;i<s.length();i++)
//	{
//		System.out.println(s.charAt(i));
//	}
