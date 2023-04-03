package Inheritance;

public class Bank 
{
String name;
String branchname;
String add;

public void display(String name,String branchname,String add)
{
	this.name=name;
	this.branchname=branchname;
	this.add=add;
	
}
public void details()
{
	System.out.println("this is the bank  name "+name);
	System.out.println("this is the branch  name "+branchname);
	System.out.println("this is the bank  name "+add);
}

}
