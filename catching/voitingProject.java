//SYNTAX OF UNCHEKED EXCEPTION;
package trying.catching;
import java.util.Scanner;

class YourAgeException extends RuntimeException
{
	YourAgeException (String msg)
	{
		super(msg);
	}
}

public class voitingProject {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Your age");
	int age=sc.nextInt();
	sc.close();
	try {
	if (age<18)
	{
		//System.out.println();
		throw new YourAgeException("You can not vote.Because You are not eligble to vote");
	}
	else 
	{
		System.out.println("You can vote.You are eligable to vote");
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
	System.out.println("Here the programme is end ");
	}
	}
    
}
