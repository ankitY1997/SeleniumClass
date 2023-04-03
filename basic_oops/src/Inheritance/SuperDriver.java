package Inheritance;

public class SuperDriver extends SuperChild1 {

	public static void main(String[] args) 
	{
		
		SuperDriver e1=new SuperDriver();
		
		e1.setBmwName("bmw-crossfire","black","petrol");
		
		System.out.println("=================================");

		e1.setAudiName("audi-v8","grey", "gasoloine");
	}

}
