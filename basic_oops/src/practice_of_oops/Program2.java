package practice_of_oops;

public class Program2 
{
String z="ankit";
int x=20;
{
	System.out.println("this is first non static block");
	System.out.println(x);
	System.out.println(z);
}
public static void main(String []args)
{
	System.out.println("this is main method");
	Program2 v=new Program2();
	v.test();
	
}
public int test()
{
	x=50;
	System.out.println(x);
	int x=40;
	System.out.println(x);
	return 100;
	
}
{
System.out.println("this is non static second block");
test();
}
static
{
	System.out.println("this is the static method");
}
}
