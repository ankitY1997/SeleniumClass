package ObjectClass;

import CompileTImePolymorphisim.Car;

public class Program1 
{

//getClass();
	
	
	public static void main(String [] args)
	{
		Car c=new Car();//now i dont know what is the address of the object 
		
		//so i will use get class method so it will print the complete address of the class
		
		System.out.println(c.getClass());//so it will be print the complete address
		System.out.println(c);
		System.out.println(Integer.toHexString(c.hashCode()));
	}

}
