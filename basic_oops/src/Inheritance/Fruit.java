package Inheritance;

public class Fruit {

	//inheritance basically when child inherit the property of parents 
	//supposed we have fruit class and fruit is parent of all fruit just like mango and banana
	//so we derive the some states and behaviors in parent class
	
	//how to achived inheritance 
	//1.we dont declare any states and behavior with private keyword becauase we can't be access 
	//private keyword directly outside the class 
	//here we can use extends keyword in child class
	
	String qual_1="fruit is soo sweet";
	
	String colour_1="fruit has a some colour ";
	
	public String qualFruit()
	{
		
		String c="this is parent method and this is fruit class";
		
		return c;
	}
	
	

}
