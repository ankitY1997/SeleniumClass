package ExceptionHandling;

public class UnderAgeException extends Throwable
{
	UnderAgeException()
	{
		System.out.println("you are in under age  you are not elgible for vote");
	}

}
