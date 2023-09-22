package trying.catching;
//Throw Exception using "Throws And Throw;

class NegativeDimantionException extends Exception
{
	public String toString()
	{
	return"You enter a false input";
	}
}
public class ThrowExample2 
{
	static int area(int l,int b)throws NegativeDimantionException
	{
		if(l<0||b<0)
		throw new NegativeDimantionException();
		return l*b;
	}
	static void meth1()throws NegativeDimantionException
	{
		System.out.println("The area of the Reactangle is "+area(10,-5));
	}

	public static void main(String[] args) 
	{
		try
		{
		meth1();
		}
		catch(NegativeDimantionException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you for using our programme");
		}
	}

}
