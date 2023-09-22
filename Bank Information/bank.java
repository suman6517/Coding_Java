package bankInformation.own;
class Account
{
	private long Accno;
	private String name;
	private long Phoneno;
	protected long currentbalance;
	
	
	
	
	public long getAccno() {
		return Accno;
	}
	public void setAccno(long accno) {
		Accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(long phoneno) {
		Phoneno = phoneno;
	}

	public long getCurrentbalance() {
		return currentbalance;
	}

	public void setCurrentbalance(long currentbalance) {
		this.currentbalance = currentbalance;
	}
}
	class SavingsAccount extends Account 
	{
		public long amt;
		public long deposit()
		{
			return currentbalance+=amt;
		}
		public void withdraw(long amt)
	    {
	        currentbalance-=amt;
	    }
 }


public class bank {

	public static void main(String[] args) {
		Account A1=new Account();
		SavingsAccount s=new SavingsAccount();
		s.amt=20;
		A1.setAccno(556555);
		A1.setName("Suman");
		A1.setPhoneno(960920651);
		A1.setCurrentbalance(6500);
		System.out.println("the Account holder name"+A1.getName());
		System.out.println("The account number is "+A1.getAccno());
		System.out.println("your bank balance is "+A1.getCurrentbalance());
		
		System.out.print(s.deposit());
		
		
	}

}
