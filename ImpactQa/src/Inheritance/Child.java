package Inheritance;

public class Child extends Parent1 
{
String name;
String colour;
int weight;

public void eating()
{
 System.out.println("this is child class");
 System.out.println("child is eating");
}
public void childDisplay(String name,String colour,int weight)
{
	
	super.sleeping();
	super.display("kamalakant","brown",70);
	this.weight=weight;
	this.name=name;
	this.colour=colour;
	super.display("kamalakant","brown",70);
	super.colour="yellow";
	super.weight=65;
	
	//super.weight=weight;
	//super.name=name;
	//super.colour=colour;
	System.out.println("this is the child name "+super.name);
	System.out.println("this is the child colour "+super.colour);
	System.out.println("this is the  child weight "+super.weight);
	
	System.out.println("this is the child name "+this.name);
	System.out.println("this is the child colour "+this.colour);
	System.out.println("this is the  child weight "+this.weight);
	
	
	
}

}
