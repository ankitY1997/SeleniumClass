package Inheritance;

public class SuperChild1 extends SuperKeyword 
{
	String name="bmw";
	String colour="black";
	String engine="petrol";
	
	public void setBmwName(String name,String colour,String engine)
	{
		this.name=name;
		this.colour=colour;
		this.engine=engine;
		
		System.out.println("this is bmw car name :"+this.name);
		System.out.println("this is bmw colour name :"+this.colour);
		System.out.println("this is bmw engine variant :"+this.engine);
		
		System.out.println("============================");
		
		System.out.println("this is audi specification");
		
		System.out.println("this is audi car name :"+super.name);
		System.out.println("this is audi clour :"+super.colour);
		System.out.println("this is audi colour :"+super.engine);
	}
	
	public void setAudiName(String name,String engine,String colour)
	{
		super.setValue(name,engine,colour);
		super.display();
		System.out.println("this audi set method ");
		
	}
}
