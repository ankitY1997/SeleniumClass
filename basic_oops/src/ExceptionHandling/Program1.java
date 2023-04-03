package ExceptionHandling;

import java.io.File;

public class Program1 
{
//now first we will see what is compile time exception
/*handle a exception throw a try catch
 * 
 * syntax=>  try{
 * 					risky code	}
 * catch(Exception e)
 * {
 * 
 * }
 * 
 * 
 * 
 *  */	
	
	public static void main(String []args)
	{
		File f=new File("E:\\automation.txt");
		
		if(!(f.exists()))
		{
			try {
			
				f.createNewFile();// so int his line it shows exception now we have to handle it
				System.out.println("file is created ");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("file is exist ");
			f.delete();
		}
		
		directory();
		runTime();
	}
	
	//now i want to created a directory
	
	public static void directory()
	{
		//For single directory
		File f=new File("E:\\ankit");
		
		if(!(f.exists()))
		{
			f.mkdir();
			System.out.println("directory is created");
			
			
		}
		else
		{
			f.delete();
			System.out.println("directory  is  exist ");
		}
	}
	// mow we will see the run time exception 
	public static void runTime()
	{
		
		int a=50;
		int b=0;
		try {
		System.out.println(a/b);// here it will get exception at runtime 
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("this run time exception we are handle it thorw a try catch");
	}
	
}
