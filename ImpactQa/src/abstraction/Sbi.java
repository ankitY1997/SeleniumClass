package abstraction;

public class Sbi implements RBI,WBI 
{
	public static String name="ankit";
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		this.insurance();
		System.out.println("this is the withdraw facility");
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		this.debit();
		System.out.println("this is the insurance facility");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		this.homeLoan();
		System.out.println("this is the debit facility");
	}
	public  void homeLoan()
	{
		this.personal();
		System.out.println("this is the homeloan facility");
	}
	public void personal()
	{
		System.out.println("this is the personal loan facility");
	}
	
	public static void main(String []args)
	{
		Sbi cc=new Sbi();
		cc.withdraw();
		name="yadav";
		System.out.println(name);
		System.out.println(a);
	
	
	}

}
