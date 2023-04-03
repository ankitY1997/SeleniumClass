package ExceptionHandling;

public class YoungAgeException extends RuntimeException
{

	YoungAgeException(String name )
	{
		super(name);
		System.out.println("this voting error");
	}
}
