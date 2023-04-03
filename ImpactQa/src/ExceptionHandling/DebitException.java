package ExceptionHandling;

public class DebitException extends RuntimeException
{
	public DebitException(String msg,int name)
	{
		super(msg);
		System.out.println("ERROR CODE IS : "+name);
	}
}
