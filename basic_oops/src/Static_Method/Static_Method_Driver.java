package Static_Method;

public class Static_Method_Driver 
{
	static int j=Static_method1.test();
public static void main(String []args)
{
	//now i will call static test method which persent in static method1 class  with help of class name so lets see
	Static_method1.test();// this is the call of method with help of class name
	System.out.println(j);
	System.out.println(Static_method1.test());
	
}
}
