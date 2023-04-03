package Inheritance;

public class Landrover extends Fortuner 
{

	String name1="this is defender";
	String colour1="white";
	int chasis_no1=12345747;
	
public void display()
{
	System.out.println("this is landrover states ");
	System.out.println(name1);
	System.out.println(colour1);
	System.out.println(chasis_no1);
	System.out.println("=====================");
	
	System.out.println("this is toyata class ");
	
	System.out.println(name);
	System.out.println(variant);
	System.out.println(chasis_no);
	
	System.out.println("=============================");
	
	System.out.println("this parent car");
	System.out.println(body);
	System.out.println(engine);
	System.out.println(colour);
	
	//see all property we can access without super keyword because we inherit the property in
	//in landrover class
	
	
	
}

public static void main(String []args)
{
	Landrover e1=new Landrover();
	
	e1.display();
}

	

}
