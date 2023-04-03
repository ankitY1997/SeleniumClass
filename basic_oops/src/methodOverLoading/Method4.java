package methodOverLoading;

public class Method4 
{
	public static void main(double a)
	{
		System.out.println("the result is :"+(a/1));
	}
	public static void main(double a,double b,double c)
	{
		System.out.println("the result is :"+((a*b)/c));
	}
	public static void main(double a,double b,double d,double c)
	{
		System.out.println("the result is :"+((a*b*d)/c));
	}
	public static void main(double a,double b,double e,double d,double c)
	{
		System.out.println("the result is :"+((a*b*e*d)/c));
	}
	
}
