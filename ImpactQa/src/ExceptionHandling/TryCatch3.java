package ExceptionHandling;

public class TryCatch3 
{
//we can also add multiple catch block with one try block 
//but you have to remember one thin if we use one catch block where we will tack parent of exception than another catch 
	//throw an error
	
	public static void main(String []args)
	{
		int i=2,b=0,c;
		try
		{
		c=i/b;
		
		
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		/*catch(AirthmeticException ae)
		{
			//so this block is given error because in upper catch block we use parent of all exception..so its able to show 
			//all kind of parent exception so you dont need to cover this catch  block okk thats why it will throw error
		
		}*/
		catch(Exception e)
		{
		System.out.println(e);	
		}
		System.out.println("hello");
	}
}
