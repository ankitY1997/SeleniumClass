package Inheritance;

public class Sbi extends Bank 
{
	String name;
	String branchname;
	String add;
	
	public void displaySbi(String name,String branchname,String add)
	{
	this.name=name;
	this.branchname=branchname;
	this.add=add;
	/*System.out.println("this is the bank  name "+name);
	System.out.println("this is the branch  name "+branchname);
	System.out.println("this is the bank  name "+add);
	System.out.println("this is the bank  name "+super.name);
	System.out.println("this is the branch  name "+super.branchname);
	System.out.println("this is the bank  name "+super.add);*/
	}
	public void show()
	{
		
		System.out.println("this is the bank  name "+name);
		System.out.println("this is the branch  name "+branchname);
		System.out.println("this is the bank  name "+add);
		System.out.println("this is the bank  name "+super.name);
		System.out.println("this is the branch  name "+super.branchname);
		System.out.println("this is the bank  name "+super.add);
	
	}
	
	public static void main(String []args)
	{
		Sbi cc=new Sbi();
		cc.display("R.B.I","ROHINI DELHI","DELHI");	
		//cc.displaySbi("S.B.I","DAMODARPURA","NIMACH");
		cc.show();
		
	}
	
}
