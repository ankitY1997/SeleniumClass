package StringHandling;

public class Recursion 
{
	public static void main(String []args)
	{	
	fact(1);
	}
	public static int fact(int n)
	{
	int x=50;
	
	if((x)%n==0)
	{
		System.out.println(n);
	}
	
	
		if(n<=50)
		{
			fact(n+1);
			//System.out.println(n);
		}
		
		
		//System.out.println(n);

		return n;
	}
}
