package ExceptionHandling;

public class TryCatch 
{
//using try catch block
	public static void main(String[] args)
	{
		//run  time exception 
		
		main();
		/*int a=50,b=0,c;
		System.out.println("1");
		
		try
		{
			System.out.println("2");
		c=a/b;
		System.out.println("3");
		System.out.println(c);
		System.out.println("4");
		}
		catch(Exception ae)
		{
			System.out.println("5");
			System.out.println("exception due to number divided by zero");
			ae.printStackTrace();
		}
		
		System.out.println("exception handling achived");
		//*/
		
	}
	//exception is not there 
	public static void main()
	{
		
		int a=50,b=2,c;
		System.out.println("1");
		
		try
		{
			System.out.println("2");
		c=a/b;
		System.out.println("3");
		System.out.println(c);
		System.out.println("4");
		}
		catch(Exception ae)
		{
			//this block is not executed because exception is not there 
			System.out.println("5");
			System.out.println("exception due to number divided by zero");
			ae.printStackTrace();
		}
		
		System.out.println("exception handling achived");	
	
		
	}
}



