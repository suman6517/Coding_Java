package trying.catching;
//PROPOGATION EXAMPLE .
public class ThrowExcetion 
{
	static int meth1()
	{
		return 10/0;
	}
	static int meth2()
	{
		return meth1();
	}
	static int meth3()
	{
		return meth2();
	}
	public static void main(String[] args)
	{
		try
		{
			meth3();	
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
	}

}
