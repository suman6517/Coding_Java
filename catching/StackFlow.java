package trying.catching;
//Student challenge
class StackoverFlow extends Exception
{
	public String toString()
	{
	return "The String is full";
}
}
class UnderFlow extends Exception 
{
	public String toString()
	{
		return "the string is empety";
	
	}
}

class Stack 
{
	private int size;
	private int top=-1;
	private  int S[];
	
	public Stack(int sz)
	{
		size=sz;
		S=new int [sz];
		
	}
	public void push(int x) throws StackoverFlow
	{
		if (top==size-1)
			throw new StackoverFlow();
		top++;
			S[top]=x;
	}
	
	public int  pop() throws UnderFlow
     {
    	 int x=-1;
    	 if (top==-1)
    		 throw new UnderFlow();
    		 x=S[top];
    	 top--;
    	 return x;
     }
	
	
}


public class StackFlow {

	public static void main(String[] args) 
	{

        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        
        }
        catch(StackoverFlow s)
        {
            System.out.println(s);
        }
		
	}

}
