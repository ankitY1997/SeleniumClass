package ExceptionHandling;
import java.io.*;
public class ThrowsKeyword
{
	
/*throws keyword is used to transfer a exception 
 * Syntax :-methodName() throws exception1,io exception
 * so see how it will work 
 */
	
	public static void main(String []args) throws  IOException
	{
	
		FileInputStream fis=new FileInputStream("D:\\Gaurav\\cde.txt\\cdef.txt");
		int  data ;
		
		//System.out.println((char)data);
		
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);	
		}
		
		fis.close();
		
	}
	
}
