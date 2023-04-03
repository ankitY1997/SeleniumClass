package ExceptionHandling;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) throws UnderAgeException {
		
		//throw keyword is used to throw a customized exception now we have to see how to use 
		/* first we will  make a exception so let see how we can make  */
		
	
		voter();
		
	}

	public static void voter() throws UnderAgeException
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age ");
		int age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("vote is sucessfully");
		}
		else
		{
			throw new UnderAgeException();
		}
		
		
		
	}
	
}
