package OverRiding;

public class Driver {

	public static void main(String[] args) 
	{
		//When i call parent method so it will give implementation of child method 
		
		//this is the compile time overriding 
		
		
		
		//this is the run time overriding when you use up casting 
		Vechile a1=new Bike();
		
		a1.name("hayabusa");
//actually i am calling viechle  name method but at a run time  jvm goes bike class implementation
//so this the use of over riding 
		

	}

}
