package Static_Method;

public class Static_block
{
	static int i=20;
	static int j;
	static
	{
		j=50;
		System.out.println("this is static block");
		j=48;
		System.out.println(j);//48
		System.out.println(i);//20
	}
	public static void main(String []args)
	{
		System.out.println(i);// 60
		System.out.println(j);// 70
		System.out.println(i);// 60
	}
	static
	{
		System.out.println(i);// 20
		i=60;
		j=70;
		System.out.println(i);// 60
	}
}
