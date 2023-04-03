package ExceptionHandling;
import java.util.Scanner;
public class ThrowKeyword 
{

	public static void main(String []args)

	{
		//throw keyword is used to give customized exception
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age ");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
		
		throw new YoungAgeException("you are not elgible for vote");
		//dont write any thing below throw method
		     }
			else
			{
				System.out.println("sucessfully vote");
			}
		}
		catch(YoungAgeException ae)
		{
			ae.printStackTrace();
		}
		finally
		{
			//System.out.println("this block is also executed");
		}
	}
	
}
