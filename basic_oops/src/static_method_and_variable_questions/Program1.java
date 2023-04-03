package static_method_and_variable_questions;

class Program1 
{
	static int i=12;
	public static void demo()
	{
		j=45;
		int i=84;
		System.out.println(i);
		System.out.println(j);
		test();
		System.out.println(i);
		System.out.println(j);
		
	}
	public static void main(String []args)
	{
		System.out.println(i);
		System.out.println(j);
		i=63;
		j=74;
		demo();
		System.out.println(i);
		System.out.println(j);
		test();
		System.out.println(i);
		int i=28;
		System.out.println(j);
		System.out.println(i);
		System.out.println(Program1.i);
	}
	static int j=102;
	public static void test()
	{
		int i=42;
		System.out.println(i);
		System.out.println(j);
		System.out.println(Program1.i);
	}
}
