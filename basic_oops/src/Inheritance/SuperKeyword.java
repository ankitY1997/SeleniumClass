package Inheritance;

public class SuperKeyword 
{
//Super keyword:-super keyword is used to call immediate parent variable or methods and constructor
//so basically super keyword used where  inheritance concept present
//soo lets see the concept of super keyword
//its also used to initialize parent member and call
	
	String name="audi";
	String colour="white";
	String engine="diesel";
	
	public void setValue(String name,String colour,String engine)
	{
		this.name=name;
		this.colour=colour;
		this.engine=engine;
		
		
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.colour);
		System.out.println(this.engine);
	}
}
