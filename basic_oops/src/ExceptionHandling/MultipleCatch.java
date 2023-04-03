package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class MultipleCatch 
{

	/*SYNTAX=>
	 * 
	 * try{
	 * }
	 * catch(IOException e)
	 * {
	 * 
	 * }
	 * catch(FileNotFoundException a)
	 * {
	 * 
	 * }
	 * catch(Exception b)
	 * {
	 * 
	 * }
	 * 
	 */
	
	public static void main(String[] args) 
	{
	File f=new File("D:\\automation\\get");
		try {
			
			
			f.createNewFile();
		   }
	catch(IOException e)
	{
	e.printStackTrace();	
	}
	catch(IndexOutOfBoundsException a)
		{
		a.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	
}
