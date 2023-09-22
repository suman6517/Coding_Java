package bankInformation.own;

class parent
{
	public void display()
	{
		System.out.println("Hellow");
	}
}
class child extends parent
{
	@Override
	public void display()
	{
		super.display();
		System.out.println("Hellow wellcome");
	}
}
public class Test2 {
	public static void main(String[]args)
	{
		child su=new child();
		su.display();
	
		
	}

}
