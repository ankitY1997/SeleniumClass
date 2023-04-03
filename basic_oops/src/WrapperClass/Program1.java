package WrapperClass;

public class Program1 {

	//boxing/autoboxing =>why we doo ? because if you use wrapper class so you will use many method +
	public static void main(String[] args) 
	{
		
		int x=40;
		
		Integer y=x;
		
		//wrapper class provide a many method so we can used 
		System.out.println(Integer.toHexString(x));
		
		main();
		
		//un boxing 
		
		unBoxing();

	}

	public static void main()
	{
		char z='a';
		
		Character m=z;
		
		System.out.println(Character.isLowerCase(z));
	}
	
	public static void unBoxing()
	{
		//unboxing converting non primitive data type into primitive data type 
		
		
		Integer c=50;
		int m=c;
		
		System.out.println(c);
	}
	
}
