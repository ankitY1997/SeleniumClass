package Static_Method;

public class Non_static_block 
{

	int i=50;
	int j=40;
	{
		System.out.println(i);//50
		i=30;
		
		System.out.println(i);//30
		
	}
	public static void main(String []args)
	{
		Non_static_block n=new Non_static_block();
		System.out.println("this is the main method");
		Non_static_block m=new Non_static_block();
		System.out.println("this is the again  main method");
		n.i=50;
		
		System.out.println(n.i);
		System.out.println(m.j);
		
		
	}
	{
		ankit();
		System.out.println("this is second  non static block ");
		System.out.println(i);//30
	}
	 static  
	 {
		Non_static_block n=new Non_static_block();
		 n.i=50;
		 System.out.println("this is  static method :"+" "+n.i);
		
	 }
	 public void ankit()
	 {
		 System.out.println("this is void method");
	 }

}
