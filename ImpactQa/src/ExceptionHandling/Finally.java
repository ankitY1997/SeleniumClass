package ExceptionHandling;
//import java.util.Scanner;
public class Finally 
{
//using finally block
//finally block always use with try or try catch block
	
	public static void main(String[] args)
	{
		//now we take a example with try or finally block
		//Program3 cc=new Program3();
		Program3.main(args);
		//System.out.println("hello");
	
			
	
		try
		{
			//int a=100,b=0,c;
			int a=100,b=2,c;
			c=a/b;
			System.out.println(c);
			
		}
		finally
		{
			//here we can close the object which we are open in try block
			//finally block is always executed //if exception is persent or not 
			System.out.println("this block is always executed");
		}
		
		
	}
	
}

//now we will see finally block  with try catch block
 class Program3
{
public static void main(String []args)
{
	try
	{
		int a=100,b=0,c;
		 c=a/b;
		 System.out.println(c);
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
	finally
	{
		//here we close the object which we are open in try block
		System.out.println("this is block is executed ");
	}
	
}
}
