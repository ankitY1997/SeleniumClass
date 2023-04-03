package ExceptionHandling;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinalyBlock 
{
	 public static FileInputStream fis;

	//finally block will always use with try block
	
	//so first we will see how can i use 
	
	//finally block is always executed no matter exception is handle or not it will always executed 
	
	public static void main(String[] args) throws IOException 
	{
	
		
		
		
		int a=50;
		int b=0;
		try
		{
		System.out.println(a/b);
	   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
		
			System.out.println("this is finally block");
		}
		
	
	}
	
	
}
