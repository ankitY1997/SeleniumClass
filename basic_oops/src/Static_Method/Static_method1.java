package Static_Method;

public class Static_method1 
{
	static int i=20;
	 int j;
	public static void main(String []args)
	{
		Static_method1 m=new Static_method1();
		System.out.println("this is main mehtod");
		System.out.println(i);//20
		test();//if method persent in same class than u can call easily but if u want to call method
		//out side the class than u can use classname.methodname .so example we will see in driver program
		System.out.println(i);//70
		m.j=24;
		System.out.println(m.j);//24
	}
	public static int test()
	{
		System.out.println("this is test method");
		i=40;
		int i=20;
		System.out.println(i);//20
		i=60;
		System.out.println(i);//60
		System.out.println(Static_method1.i);//40
		Static_method1.i=70;
		System.out.println(i);//60
		System.out.println(Static_method1.i);//70
		int c=Static_method1.i+i;//130
		System.out.println("*****************************s");
		return c;
		
	}

}
