package ExceptionHandling;
import java.util.Scanner;
public class CustomizedException 
{

	public static void main(String []args) 
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter the amount ");
		int amt=x.nextInt();
		
		try
		{
		if(amt<=0)
		{
			System.out.println("pls visit your nearest branch");
			throw new DebitException("you can not withdraw a money",001);
			//System.out.println("xyz");
		}
		else 
		{
		System.out.println("amt is suceesfully debited");	
		}
	
		}
		catch(DebitException ar)
		{
			ar.printStackTrace();
		}
		finally
		{
			System.out.println("thank you");
		}
		
	}
	
}
