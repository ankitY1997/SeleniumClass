package Inheritance;

public class Fortuner extends Car
{


	String name="this is toyata";
	String variant="this is diesel variant";
	int chasis_no=1230245;
	
	public void frotuner()
	{
		//below is parent member
		
		System.out.println(body);
		System.out.println(colour);
		System.out.println(engine);
	//	System.out.println(chasis_no1);//see it will throw error because we can't access the private keyword 
		System.out.println(name);
		
		System.out.println("====================================");
		
		System.out.println(variant);
		System.out.println(chasis_no);
		
		System.out.println(body);
		
		
		System.out.println("extra fetauures ");
		
		System.out.println("fortuner has a six air bag");
		
		System.out.println("foruner have very good speaker");
		
		System.out.println("this is diesel vairant ");
		
		
	}
	
	//now we have 9 member becuase we have one private variable 

}
