package ObjectClass;

import CompileTImePolymorphisim.Car;

public class To_String_Method 
{
	//public To_String_Method m;
	String name ="ankit";
	String bloodGroup="O+";
	
	
public static void main(String[] args)
{
   
	To_String_Method m=new To_String_Method();
	
	//now simply when i dont over ride the method so that time it will print the address
	
	
	System.out.println(m.toString());
	

	
	
}
	@Override
	public String toString()
	{
	
		
		return this.name+" => "+this.bloodGroup;
	}

//	@Override
	
	/*public int hashCode()
	{
		
		
		return Integer
	}*/

}
