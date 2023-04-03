package abstraction;

public class UltratechCement implements ADITYABIRLA,TATA
{
public void employe()
{
	
}
	
	public void Salary()
	{
		System.out.println("this salary method");
	}
	
	public void home()
	{
		this.Salary();
		
	}
	
	public void electricity()
	{
		this.home();
	}
	public void pf()
	{
		System.out.println("this is the pf fund");
	}
	public static void main(String []args)
	{
		UltratechCement cc=new UltratechCement();
		cc.electricity();
		cc.pf();
		System.out.println(name);
		ADITYABIRLA.union();
	}
	
}
