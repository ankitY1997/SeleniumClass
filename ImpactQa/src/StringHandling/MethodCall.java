package StringHandling;

public class MethodCall 
{
	//14/10/22
// we have a three type of method 
	//1.non parameterized method
	//2. parameterized with argument
	//3.method with return type
	
	public static void main(String []args)
	{
	
		main();
		main(20,30);
		int x=main(20,30,40);
		System.out.println(x);
		MethodCall s=new MethodCall();
		s.main("ankit","yadav");
	}
	
	public static void main()
	{
		System.out.println("this is non parameterized method");
	}
	public static void main(int a,int b)
	{
		int c=a+b;
		System.out.println("this is  parameterized method :"+c);
	}
	public static int main(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("this is parameterized method with "+d);
		return d;
	}
	public void main(String a,String b)
	{
		System.out.println(a+" "+b);
	}
	
	
}
