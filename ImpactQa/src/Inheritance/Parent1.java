package Inheritance;

public class Parent1 extends Parent2 
{
 String name;
 String colour;
 int weight;
 
 Parent1()
 {
	 
 }
 
	
	public  void sleeping()
	{
		super.dispaly("vishnu",65);
		System.out.println("this is the parent class");
		System.out.println("this is the sleeping method");
		super.n="shubham";
		System.out.println("this is parent 2 name intialization "+n);
		super.dispaly("shubham",65);
	}
	
	public void eating()
	{
		System.out.println("this is the parent class");
		System.out.println("this is the sleeping method");
	}
	
	public void display(String name,String colour ,int weight)
	{
		this.name=name;
		this.colour=colour;
		this.weight=weight;
		
	}
	
}
