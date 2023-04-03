package ExceptionHandling;

public class TryCatch2 
{
//this is the another way
	
	public static void main(String [] args)
	{
		
	// see now we will not do exception handing see what will be happen
		main1();
		main();
		/*main1(); if i will put this method below this un exception handling method so this method cant be executed 
		 because is abnormally terminated by upper method  */
	}
	public static  void main()
	{
		int a=100,b=0,c;
		
		c=a/b;
		System.out.println(c);
		System.out.println("hello");//here it will not print because we cant handle excpetion its abnormally terminated the block
	}
	
	//int this method we can use try catch
	public static void main1()
	{
		int a=100,b=0,c;
	
		System.out.println("this is hello block");
		System.out.println("this is method 1");
		try
		{
			c=a/b;
		}
		catch(Exception ae)
		{
			System.out.println("this is catch block");
			//System.out.println(ae);
			System.out.println("hello1");
		}
		
		
		
	}
}
