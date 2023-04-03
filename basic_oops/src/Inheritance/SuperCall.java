package Inheritance;

public class SuperCall 
{
//super call is used to call constructor  which is present immediate parent class
	
	
public SuperCall()
{
	System.out.println("this is parent class constructor ");
}
public SuperCall(String name)
{
	this();//this constructor chaining
	System.out.println("this is second constructor inside parent class"+name);
}
public SuperCall(String name,String id)
{
	this(name);//this is constructor chaining 
	System.out.println("this is the third constructor inside the parent class"+name+" "+id);
}

}
