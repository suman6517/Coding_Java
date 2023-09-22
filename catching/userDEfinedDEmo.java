//SYNTAX OF CHECKED EXCEPTION;
package trying.catching;
import java.util.*;

class UserDefinedException extends Exception
{
	UserDefinedException()
	{
		super ("You are under age so you can not vote.");
	}
	UserDefinedException(String message)
	{
		super ( message);
	}
}

public class userDEfinedDEmo {

	public static void main(String[] args) throws UserDefinedException
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter your perfect age ");
	 int age=sc.nextInt();
	 sc.close();
	 if (age<18)
	 {
		 throw new UserDefinedException("YOu can not vote because you are under age.");
	 }
	 else
	 {
		 System.out.println("Your age is perfect and you can vote");
	 }
	 
	 System.out.println("Thank you for using our programme ");

	}

}
