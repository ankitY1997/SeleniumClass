package Abstratction;

public class Body extends Bike 
{

	@Override
	public void bike() {
		
		System.out.println("this is bike");
		
	}

	@Override
	public void headLight() {
		
		System.out.println("this is the bike headlight inside the bike class");
		
	}

	@Override
	public void engine() {
		
		System.out.println("abstract method inside the  car class");
		
	}

	@Override
	public void door() {
		
		System.out.println("this is abstract method inside car class ");
		
	}

	@Override
	public void name() {
		
		System.out.println("this is the abstract method present inside the viechle class  jeep");
		
	}

	@Override
	public void colour() {
		
		System.out.println("this us the abstract method persent inside the viechle class ");
		
	}

	
	
}
