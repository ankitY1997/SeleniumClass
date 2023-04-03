package Inheritance;

public class ElectricCar2 extends Vechile
//up casting 
{
public void shape()
{
	System.out.println("this is the electric car method ");
}
public void gear()
{
System.out.println("gear has six gear ");	
}

public static void main(String []args)
{
	Vechile v=new ElectricCar2();
	ElectricCar2 z=(ElectricCar2)v;//down casting
	z.gear();
	v.shape();
}
}
