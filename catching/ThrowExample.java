package trying.catching;
//IF WE WANT TO THROW EXCEPTION
public class ThrowExample 
{
    static int area(int l, int b)throws Exception
    {
    	if (l<0||b<0)
    	throw new Exception();
    	return l*b;
    }
    static void meth1()throws Exception
    {
    	System.out.println("The area of the Reactangle is "+area(10,-5));
    }

	public static void main(String[] args) throws Exception
	{
		meth1();
		

	}

}
